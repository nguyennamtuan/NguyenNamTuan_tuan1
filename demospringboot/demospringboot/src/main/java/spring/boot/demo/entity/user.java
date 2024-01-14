package spring.boot.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String fullName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public user(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public user() {
		super();
	}

}
