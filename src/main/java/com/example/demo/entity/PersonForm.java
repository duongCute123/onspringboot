package com.example.demo.entity;

public class PersonForm {
	String firstName;
	String lastName;

	public PersonForm(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "PersonForm [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public PersonForm() {
		super();
	}

}
