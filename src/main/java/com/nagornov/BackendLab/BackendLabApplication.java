package com.nagornov.BackendLab;

import com.nagornov.BackendLab.infrastructure.EnvLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendLabApplication {

	public static void main(String[] args) {
		EnvLoader.init();

		SpringApplication.run(BackendLabApplication.class, args);
	}

}
