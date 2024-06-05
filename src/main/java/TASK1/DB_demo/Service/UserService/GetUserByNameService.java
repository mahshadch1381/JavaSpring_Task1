package TASK1.DB_demo.Service.UserService;
import TASK1.DB_demo.Model.User;
import TASK1.DB_demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GetUserByNameService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserValidationService userValidationService;

    public ResponseEntity<?> getByName( String name) {
        try {
            if (!userValidationService.HaveUserByName(name)) {
                return new ResponseEntity<>("User with name does not exist", HttpStatus.NOT_FOUND);
            }
            List<User> existingUser = userRepository.findByName(name);
            return new ResponseEntity<>(existingUser, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
