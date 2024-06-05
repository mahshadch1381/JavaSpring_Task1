package TASK1.DB_demo.Controller;

import TASK1.DB_demo.Model.User;
import TASK1.DB_demo.Repository.UserRepository;
import TASK1.DB_demo.Service.UserService.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailValidationService emailValidationService;
    @Autowired
    private AddUserService addUserService;
    @Autowired
    private UpdateUserService updateUserService;
    @Autowired
    private GetUserByNameService getByNameService;
    @Autowired
    private DeleteUserService deleteUserService;

    @PostMapping(path="/addUser")
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {

        return addUserService.InsertUser(name,email);
    }

    @GetMapping(path="/getAllUsers")
    public @ResponseBody Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }
    @GetMapping(path="/getUserByName")
    public ResponseEntity<?> getByName(@RequestParam String name) {
       return getByNameService.getByName(name);

    }
    @PutMapping(path="/updateUser")
    public ResponseEntity<?> updateUser(@RequestParam int id, @RequestParam String name, @RequestParam String email) {
        return updateUserService.updateUserInfo(id,name,email);
    }
    @DeleteMapping(path="/deleteUser")
    public ResponseEntity<?> deleteUser(@RequestParam int id) {
       return deleteUserService.deleteUser(id);
    }
}
