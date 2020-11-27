package org.apache.camel.workshop.recommendation;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Collections;

@SpringBootApplication
public class RecommendationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendationApplication.class, args);
	}


	

}
