package com.unicomer.item.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.google.common.collect.Lists;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {

	@Value("${app.host.ip}")
	private String ip;

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(Arrays.asList("application/json"));
	private static final Set<String> DEFAULT_PROTOCOLS = new HashSet<>(Arrays.asList("https"));

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.unicomer.item.controller"))
				.paths(PathSelectors.any())
				.build().host("http://localhost:8081")
				.protocols(DEFAULT_PROTOCOLS)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES)
				.apiInfo(getApiInfo())
				.consumes(DEFAULT_PRODUCES_AND_CONSUMES)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES);
	}

	private ApiInfo getApiInfo() {
		List<VendorExtension> extensions = Lists.newArrayList();
		extensions.add(new StringVendorExtension("x-ibm-name", "item"));

		return new ApiInfo("item",
				"CREATED BY STEFANINI TEAM",
				"1.0",
				"",
				new Contact("Stefanini Team", "https://www.apache.org/licenses/LICENSE-2.0", "seulloa@stefanini.com"),
				"Apache 2.0", "https://www.apache.org/licenses/LICENSE-2.0", extensions);
	}

}
