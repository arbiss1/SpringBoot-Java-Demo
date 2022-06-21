package com.web.springdemo;

import com.web.springdemo.entities.User;
import com.web.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackageClasses = {UserService.class})
public class SprindDemoAppApplication implements CommandLineRunner {

    @Autowired
    public UserService userService;

    public static void main(String[] args){
        SpringApplication.run(SprindDemoAppApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        User createdUser =
                userService.createUser(new User(1, "test", "username"));
        System.out.println("Useri i krijuar eshte : "+ createdUser.getUsername());

    }
}
