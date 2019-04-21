package com.fosu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
//swagger2配置文件， 例 扫描包
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//当前包路径
				.apis(RequestHandlerSelectors.basePackage("com.fosu.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	//构建api文档的详细信息函数，注意 注解引用是哪个
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//页面标签
				.title("Spring boot 敏琪专用测试 使用Swagger2 构建 RestFul API o(￣▽￣)ｄ ")
				//创建人
				.contact(new Contact("miki", "782771968@qq.com", ""))
				//版本号
				.version("1.0")
				//描述
				.description("API 描述")
				.build();
	}
}
