package lu.ankang.ignitedemo.controller;

import com.google.gson.Gson;
import lu.ankang.ignitedemo.entity.FrontUser;
import lu.ankang.ignitedemo.entity.GenerateID;
import lu.ankang.ignitedemo.model.User;
import lu.ankang.ignitedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class AppController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody FrontUser frontUser) {
        Gson gson = new Gson();
        Map resBody = new HashMap<>();

        if (userService.findByUserAccount(frontUser.getUserAccount()) == null) {
            String userAccount = frontUser.getUserAccount();
            User user = new User();
            user.setPassword(frontUser.getPassword());
            user.setUserName(frontUser.getUserName());
            user.setUserID(GenerateID.getID());
            userService.save(userAccount,user);
            resBody.put("err", 200);
            resBody.put("message", "register success");
        } else {
            System.out.println("userAccount has been registed");
            resBody.put("err", 1);
            resBody.put("message", "userAccount has been registed");
        }
        return gson.toJson(resBody);
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody FrontUser frontUser) {
        Gson gson = new Gson();
        Map resBody = new HashMap<>();
        User user = userService.findByUserAccount(frontUser.getUserAccount());
        if (user != null) {
            if(user.getPassword().equals(frontUser.getPassword())){
                System.out.println("register success");
                resBody.put("err", 200);
                resBody.put("message", "register success");
            }else {
                System.out.println("userAccount or password wrong");
                resBody.put("err", 2);
                resBody.put("message", "userAccount or password wrong");
            }
        } else {
            System.out.println("userAccount hasn't been registed");
            resBody.put("err", 1);
            resBody.put("message", "userAccount hasn't been registed");
        }
        return gson.toJson(resBody);
    }
}
