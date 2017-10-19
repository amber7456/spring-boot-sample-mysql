package com.example.springbootsamplemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
//@Configuration
//@ComponentScan(basePackages = "com.example")
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.example")
@EntityScan({ "com.example.domain" })
@EnableJpaRepositories({ "com.example.repository" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
