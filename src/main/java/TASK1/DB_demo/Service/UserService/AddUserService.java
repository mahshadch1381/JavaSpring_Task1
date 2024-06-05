package TASK1.DB_demo.Service.UserService;
import TASK1.DB_demo.Model.User;

import TASK1.DB_demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailValidationService emailValidationService;
    @Autowired
    private UserValidationService userValidationService;
    public String InsertUser(String name,  String email){
        if (userValidationService.HaveUserByName(name)) {
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

}
