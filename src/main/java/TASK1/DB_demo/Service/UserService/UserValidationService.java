package TASK1.DB_demo.Service.UserService;
import TASK1.DB_demo.Model.User;
import TASK1.DB_demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserValidationService {
    @Autowired
    private UserRepository userRepository;

    public boolean HaveUserByName(String name){
        List<User> existingUser = userRepository.findByName(name);
        if (!existingUser.isEmpty()) {
            return true;
        }
        return false;
    }
    public boolean HaveUserById(int id){
        User existingUser = userRepository.findById(id);
        if (existingUser==null) {
            return false;
        }
        return true;
    }

}
