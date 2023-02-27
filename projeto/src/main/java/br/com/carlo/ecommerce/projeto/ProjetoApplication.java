package br.com.carlo.ecommerce.projeto;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableFeignClients
@EnableMongoAuditing
@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProjetoApplication.class)
		.bannerMode(Banner.Mode.OFF).run(args);
	}

}
