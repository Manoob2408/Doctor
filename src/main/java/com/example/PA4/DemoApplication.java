package com.example.PA4;


import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{
	public static void main(String[] args) throws SQLException {

		SpringApplication.run(DemoApplication.class, args);

		DriverManager.getConnection("jdbc:mysql://15.0.2000:3306/Doctor","adminManu","adminManu");
        System.out.println("Conectado!");

	}

}
