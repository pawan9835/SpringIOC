package com.app.std;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

		Student pawan = ac.getBean("pawan", Student.class);

		pawan.getStudentInfo();

	}

}
