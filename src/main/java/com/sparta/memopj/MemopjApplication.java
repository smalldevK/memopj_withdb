package com.sparta.memopj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MemopjApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemopjApplication.class, args);
	}

}
