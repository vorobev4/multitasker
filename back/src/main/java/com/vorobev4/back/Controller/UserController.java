package com.vorobev4.back.Controller;

import com.vorobev4.back.Model.User;
import com.vorobev4.back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();

        user.setName(name);
        user.setEmail(email);

        userRepository.save(user);

        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
