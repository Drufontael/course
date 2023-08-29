package com.drufontael.course.resources;

import com.drufontael.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u=new User(1L,"Maria Hill","mHill@shield.com","6169999","HateScrull");
        return ResponseEntity.ok().body(u);
    }

}
