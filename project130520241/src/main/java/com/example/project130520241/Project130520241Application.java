package com.example.project130520241;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project130520241Application {

	public static void main(String[] args) {
		// Для передачи JSON файла в качестве запроса используйте следующее выражение:
		//			http://localhost:8085/v1/users?json=%7B%22id%22:1%7D
		//											 Заменять число ^
		SpringApplication.run(Project130520241Application.class, args);
	}
}
