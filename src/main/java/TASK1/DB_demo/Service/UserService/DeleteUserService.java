package TASK1.DB_demo.Service.UserService;

import TASK1.DB_demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DeleteUserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<?> deleteUser (int id) {
        if (!userRepository.existsById(id)) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        userRepository.deleteById(id);
        return new ResponseEntity<>("User with id = " + id + " deleted", HttpStatus.OK);
    }
}
