package com.app.std;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.stdID}")
	private int stdID;
	@Value("${student.stdName}")
	private String stdName;
	@Value("${student.hobies}")
	private String hobies;

	public void getStudentInfo() {

		System.out.println(" Name : " + stdName);
		System.out.println("ID : " + stdID);
		System.out.println("Hobies : " + hobies);
	}

}
