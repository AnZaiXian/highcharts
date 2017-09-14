package com.bw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bw.mapper")
public class HighchartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighchartsApplication.class, args);
	}
}
