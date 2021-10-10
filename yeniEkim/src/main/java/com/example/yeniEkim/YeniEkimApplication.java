package com.example.yeniEkim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.DoktorRepository;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
@EnableJpaRepositories(basePackages={"repository"})
@EntityScan(basePackages = "entity")

public class YeniEkimApplication {

	public static void main(String[] args) {
		SpringApplication.run(YeniEkimApplication.class, args);
	}

}
