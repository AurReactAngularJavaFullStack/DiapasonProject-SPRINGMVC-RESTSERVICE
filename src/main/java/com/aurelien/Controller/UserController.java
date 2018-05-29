package com.aurelien.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aurelien.Entity.User;
import com.aurelien.Service.UserService;

	@RestController
	@RequestMapping("/users")
	public class UserController 
	{
		@Autowired(required=true)
		private UserService userService;
		
		@RequestMapping(method = RequestMethod.GET)
		public Collection<User> getAllStudents()
		{
			return userService.getAllUsers();
		}
		
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public User getUserById(@PathVariable("id") int id) 
		{
			return userService.getUserById(id);
		}
		@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
		public void deleteUserById(@PathVariable("id") int id) 
		{
			userService.removeUserById(id);
		}
		
		
		@RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
		public void updateUserById(@RequestBody User user)
		{
			userService.updateUser(user);
		}
		@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
		public void insertUser(@RequestBody User user)
		{
			userService.insertUser(user);
		}

}
