package com.example.organizationservice;

import com.example.organizationservice.model.Department;
import com.example.organizationservice.model.Organization;
import com.example.organizationservice.repository.OrganizationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class OrganizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationServiceApplication.class, args);
    }


    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.organizationservice.controller"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(new ApiInfoBuilder().version("1.0").title("Organization API").description("Documentation Organization API v1.0").build());
    }

    @Bean
    OrganizationRepository repository() {
        OrganizationRepository repository = new OrganizationRepository();
        repository.add(new Organization("Microsoft", "Redmond, Washington, USA"));
        repository.add(new Organization("Oracle", "Redwood City, California, USA"));
        return repository;
    }

}
