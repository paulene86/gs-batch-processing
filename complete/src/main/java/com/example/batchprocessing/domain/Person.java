package com.example.batchprocessing.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

	private String lastName;
	private String firstName;

	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName;
	}

}
