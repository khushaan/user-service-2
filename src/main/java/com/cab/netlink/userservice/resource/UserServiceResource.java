package com.cab.netlink.userservice.resource;


import com.cab.netlink.userservice.model.User;
import com.cab.netlink.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user-service")
public class UserServiceResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping("getUser/{userName}/")
    public User getUser(@PathVariable("userName") String username ){

        return userRepository.findByUserName(username);
    }

    @GetMapping("getUserId/{userId}")
    public User getUserById (@PathVariable("userId") String Id){

        return  userRepository.findUserById(Integer.valueOf(Id));
    }

    @PostMapping("createUser")
    public User createUser(@RequestBody final User user){

        return userRepository.save(user);
    }
}
