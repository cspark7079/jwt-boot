package com.cspark.jwt_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cspark.jwt_boot.mapper") // Mapper 인터페이스가 위치한 패키지 경로
@SpringBootApplication
public class JwtBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtBootApplication.class, args);
	}

}
