package com.springrest.BooksByAgatha.config;


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
public class Swagger2Configuration {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()//this method return an instance of ApiSelectBuilder which helps control end-points
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Titles Spring Boot REST API")
                .description("Spring Boot REST Api for Titles of Author Agatha Christie")
                .contact(new Contact("Nanditha Kothakota", "", "nandynew@gmail.com"))
                .license("")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }
}

