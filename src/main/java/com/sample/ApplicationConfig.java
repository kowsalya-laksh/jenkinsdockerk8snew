package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public SpringConcatenation getString()
	{
		return new SpringConcatenation();
	}

	
}
