package com.example.demo.controller;// Author - Orifjon Yunusjonov
// t.me/coderr24

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.SecurityUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@CrossOrigin(maxAge = 3600L)
public class UserController {
    private final UserRepository userRepository;


    @GetMapping("/me")
    public ResponseEntity getMe(){
        User user = userRepository.findByUsername(SecurityUtils.getCurrentUser().orElseThrow(()->new RuntimeException("username not founsd"))).orElseThrow(()->new RuntimeException("user not found"));
        return ResponseEntity.ok(user);
    }

}
