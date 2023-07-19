package com.itsfootball.itsfootball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class ItsfootballApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsfootballApplication.class, args);
	}

}
