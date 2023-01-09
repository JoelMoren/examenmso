package com.examen.msousuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsousuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsousuariosApplication.class, args);
		System.out.println("-------------------------->> Hola desde MsoUsuarios");
	}

}
