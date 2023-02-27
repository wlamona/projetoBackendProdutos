package br.com.carlo.ecommerce.projeto.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;


@Configuration
public class OpenApiConfig {
	
	  @Bean
	  public GroupedOpenApi publicApi() {
	    return GroupedOpenApi.builder()
	        .group("br.com.carlo.ecommerce")
	        .pathsToMatch("/**")
	        .build();
	  }

	  @Bean
	  public OpenAPI openAPI() {
	    return new OpenAPI()
	        .info(new Info().title("API RESTful Produtos")
	            .description("Progrqama de gerenciamento de produtos eletrônicos")
	            .version("v0.0.1")
	            .license(new License().name("Apache 2.0").url("http://springdoc.org")))
	        .externalDocs(new ExternalDocumentation()
	            .description("")
	            .url("http://localhost:8001/")
	            );
	  }

}
