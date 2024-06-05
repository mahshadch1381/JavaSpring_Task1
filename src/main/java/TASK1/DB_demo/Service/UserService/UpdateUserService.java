package TASK1.DB_demo.Service.UserService;
import TASK1.DB_demo.Model.User;
import TASK1.DB_demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class UpdateUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailValidationService emailValidationService;
    @Autowired
    private UserValidationService userValidationService;

    public ResponseEntity<?> updateUserInfo( int id, String name, String email){
        if (!userValidationService.HaveUserById(id)) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        if (!emailValidationService.isValidEmail(email)) {
            return new ResponseEntity<>("Invalid email format", HttpStatus.BAD_REQUEST);
        }
        User existingUser = userRepository.findById(id);
        existingUser.setName(name);
        existingUser.setEmail(email);
        userRepository.save(existingUser);
        return new ResponseEntity<>("User updated successfully", HttpStatus.OK);
    }
}
