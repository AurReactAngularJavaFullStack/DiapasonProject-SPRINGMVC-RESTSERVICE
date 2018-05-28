package com.aurelien.Dao;

import org.springframework.stereotype.Repository;

import com.aurelien.Entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDao 
{
private static Map<Integer, User> users;
	
	static 
	{
		users = new HashMap<Integer, User>()
		{
			{
				put(1, new User(1, 26, 3,"Aurelien","Gautherot"));
				put(2, new User(2, 14, 2,"Daniel","Ollivan"));
				put(3, new User(3, 22, 9,"Johnson","Williams"));
			}
		};
	}	

	public Collection<User> getAllUsers()
	{
		return this.users.values();
	}
	
	public User getUserById(int id)
	{
		return this.users.get(id);
	}
	public void removeUserById(int id) 
	{
		this.users.remove(id);
	}

	public void updateUser(User user) 
	{
		User s = users.get(user.getId());
		s.setAge(user.getAge());
		s.setBalance(user.getBalance());
		s.setFirstname(user.getFirstname());
		s.setLastname(user.getLastname());
		users.put(user.getId(), user);	
	}

	public void insertUserToDB(User user) 
	{
		this.users.put(user.getId(), user);
	}
	
}
