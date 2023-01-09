package com.examen.msopublicaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsopublicacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsopublicacionesApplication.class, args);
		System.out.println("-------------------------->> Hola desde MsoPublicaciones");
	}

}
