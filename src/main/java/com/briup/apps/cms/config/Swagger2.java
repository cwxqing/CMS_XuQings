package com.briup.apps.cms.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:Swagger2 
 * @author   user
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				//指定 swagger要扫描的controller所在的包
				.apis(RequestHandlerSelectors.basePackage("com.briup.apps.cms.web.controller"))
				.paths(PathSelectors.any())
				.build()
				.securitySchemes(Lists.newArrayList(apiKey()));
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CMS资讯云平台_XQ")
				.description("可在本页面进行，后端的数据传输的测试")
//				.termsOfServiceUrl("http://www.geda.com")
				.version("1.0")
				.build();
	}
	private ApiKey apiKey() {
		return new ApiKey("Authorization", "Authorization", "header");
	}
}

