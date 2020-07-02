package lu.ankang.ignitedemo.service;

import lu.ankang.ignitedemo.model.User;
import lu.ankang.ignitedemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.cache.Cache;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByUserName(String userName) {
        User user =userRepository.findByUserName(userName);
        return user;
    }

    public User findByUserAccount(String userAccount){
        Cache.Entry<String, User> entry = userRepository.findByUserAccount(userAccount);
        User user = new User();
        if (entry != null) {
            user = entry.getValue();
        } else {
            user = null;
        }
        return user;
    }

    public void save(String key,User value){
        userRepository.save(key,value);
    }

}
