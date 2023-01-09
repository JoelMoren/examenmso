package com.examen.msomonitoreo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class MsomonitoreoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsomonitoreoApplication.class, args);
		System.out.println("hola");
	}

}
