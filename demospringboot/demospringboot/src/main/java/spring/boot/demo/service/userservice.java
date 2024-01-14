package spring.boot.demo.service;

import java.util.List;

import spring.boot.demo.entity.user;

public interface userservice {
	public List<user> findAllUser();

	public void addUser(user user);
}
