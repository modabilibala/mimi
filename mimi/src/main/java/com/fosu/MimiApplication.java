package com.fosu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.fosu.dao.*"})//@MapperScan 用户扫描mybatis的mapper接口 ; @MapperScan 用户扫描shrio的 bean 文件
@EnableSwagger2//Swagger开启接口
@EnableCaching//开启缓存功能
public class MimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimiApplication.class, args);
	}
}
