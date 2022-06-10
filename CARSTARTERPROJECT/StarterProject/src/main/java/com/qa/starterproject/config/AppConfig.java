package com.qa.starterproject.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.starterproject.Service.ModelMapper;

@Configuration

public class AppConfig {

	    @Bean
		public String serverStart() {
			return "Server started at: " + LocalTime.now();
		}

		@Bean
		public ModelMapper mapper() {
			return new ModelMapper();
		}

	}


