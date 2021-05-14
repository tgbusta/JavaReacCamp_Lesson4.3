package Entities;

import Abstract.Entity;

public class Member implements Entity{

	private int id;
	private String userName;
	private String password;
	private String name;
	private String surname;
	private String identityNumber;
	private int yearOfBirth;
	
	public Member() {
		
	}
	
	public Member(String name, String surname, String identityNumber,
			int yearOfBirth) {
 		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.yearOfBirth = yearOfBirth;
	}
	
	public Member(int id, String userName, String password, String name, String surname, String identityNumber,
			int yearOfBirth) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.yearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	
	
	
}
