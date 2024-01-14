package spring.boot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.demo.entity.user;
import spring.boot.demo.responseve.userresponseve;


@Service
public class userserviceimpl implements userservice {
	@Autowired
	userresponseve userReponsive;

	@Override
	public List<user> findAllUser() {
		List<user> users=new ArrayList<>();
		users=userReponsive.findAll();
		return users;
	}

	@Override
	public void addUser(user user) {
		// TODO Auto-generated method stub
		userresponseve.save(user);
	}
}
