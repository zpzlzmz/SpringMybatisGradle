package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"data.*" ,"*.controller","naver.storage","com.example.demo"})
@MapperScan("data.mapper")
@SpringBootApplication
public class SpringMybatisGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisGradleApplication.class, args);
	}

}
