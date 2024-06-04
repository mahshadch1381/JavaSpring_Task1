package TASK1.DB_demo.Controller;

import TASK1.DB_demo.Model.User;
import TASK1.DB_demo.Repository.UserRepository;
import TASK1.DB_demo.Service.EmailValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping(path="/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailValidationService emailValidationService;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {

        List<User> existingUser = userRepository.findByName(name);
        if (!existingUser.isEmpty()) {
            return "User with name already exists";
        }

        if (!emailValidationService.isValidEmail(email)) {
            return "Invalid email format";
        }

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
    @GetMapping(path="/getbyname")
    public ResponseEntity<?> getByName(@RequestParam String name) {
        try {
            List<User> existingUser = userRepository.findByName(name);
            if (existingUser.isEmpty()) {
                return new ResponseEntity<>("User with name does not exist", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(existingUser, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @PutMapping(path="/update")
    public ResponseEntity<?> updateUser(@RequestParam int id, @RequestParam String name, @RequestParam String email) {
        User existingUser = userRepository.findById(id);
        if (existingUser == null) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        if (!emailValidationService.isValidEmail(email)) {
            return new ResponseEntity<>("Invalid email format", HttpStatus.BAD_REQUEST);
        }
        existingUser.setName(name);
        existingUser.setEmail(email);
        userRepository.save(existingUser);
        return new ResponseEntity<>("User updated successfully", HttpStatus.OK);
    }
    @DeleteMapping(path="/delete")
    public ResponseEntity<?> deleteUser(@RequestParam int id) {
        if (!userRepository.existsById(id)) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        userRepository.deleteById(id);
        return new ResponseEntity<>("User with id = " + id + " deleted", HttpStatus.OK);

    }
}
