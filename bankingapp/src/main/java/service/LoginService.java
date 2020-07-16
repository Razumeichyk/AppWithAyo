package service;

import model.User;
import repository.UserRepository;

import java.sql.SQLException;

public class LoginService {

    private UserRepository userRepository = new UserRepository();

    public boolean authenticateUser(User user){
        try {
            User userFromDb = userRepository.findUserById(user.getId());

            if (userFromDb != null && user.getPassword().equals(userFromDb.getPassword()))
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
