package com.zohaib.research.oauth2.servers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncodingConfig {
	@Bean
	public PasswordEncoder oauthClientPasswordEncoder() {
		return new BCryptPasswordEncoder(4);
	}

	@Bean
	public PasswordEncoder userPasswordEncoder() {
		return new BCryptPasswordEncoder(8);
	}
}
