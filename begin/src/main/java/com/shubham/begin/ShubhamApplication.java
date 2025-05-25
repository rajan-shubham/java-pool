package com.shubham.begin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShubhamApplication implements CommandLineRunner {

	@Autowired
	DB db;

	public static void main(String[] args) {SpringApplication.run(ShubhamApplication.class, args);}

	@Override
	public void run(String... args) throws Exception{
		System.out.println(db.getData());
	}

}
