package com.unicomer.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class ItemApplication {

	public static void main(String[] args) {

		ConfigurableEnvironment environment = new StandardEnvironment();
		environment.setActiveProfiles("dev");

		SpringApplication sa = new SpringApplication(ItemApplication.class);
		sa.setEnvironment(environment);
		sa.run(args);
	}

	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();

		messageSource.setBasename("classpath:params");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

}
