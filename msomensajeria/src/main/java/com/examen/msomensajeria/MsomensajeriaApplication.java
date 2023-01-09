package com.examen.msomensajeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsomensajeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsomensajeriaApplication.class, args);
		System.out.println("-------------------------->> Hola desde MsoMensajeria");
	}

}
