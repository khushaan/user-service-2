package com.cab.netlink.userservice.repository;


import com.cab.netlink.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

     User findByUserName(String username);
     User findUserById(Integer id);
}
