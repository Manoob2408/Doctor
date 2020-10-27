package com.example.PA4;


import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{
	public static void main(String[] args) throws SQLException {

		SpringApplication.run(DemoApplication.class, args);

		DriverManager.getConnection("jdbc:mysql://localhost/Doctor","adminManu","adminManu");
        System.out.println("Conectado!");

	}

}
