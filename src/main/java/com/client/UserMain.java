package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.User;
import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx= new ClassPathXmlApplicationContext("user-config.xml");
		User user= new User(0, "admin", "admin");
		User user1= new User(1, "user", "user");
		User user2= new User(2, "spectator", "spectator");		
		
		UserService userService= ctx.getBean(UserService.class);
		userService.addUser(user);
		userService.addUser(user1);
		userService.addUser(user2);
		
		
	}

}
