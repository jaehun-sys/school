package com.example.school;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;


@Configuration
@ComponentScan(basePackages = "com.example.*")
@MapperScan(basePackages = "com.example.mapper")
public class ApplicationConfig{
	
}