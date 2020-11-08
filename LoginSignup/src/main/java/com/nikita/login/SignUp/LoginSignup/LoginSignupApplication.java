package com.nikita.login.SignUp.LoginSignup;

import com.nikita.login.SignUp.LoginSignup.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSignupApplication {
   @Autowired
   UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(LoginSignupApplication.class, args);
	}



}
