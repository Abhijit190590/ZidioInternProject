package com.example.ZidioProject_Backend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig<AuthService> {
	@Autowired
	private AuthService authservice;
	
	@Bean
	public <HttpSecurity, SecurityChain> SecurityChain securityChain(HttpSecurity http)throws Exception{
		http.csrf().
		disable().
		authorizeHttpRequest().
		requestMatchers("/api/auth/**").permitAll.
		anyRequest().
		authenticated();
		
		return http.build();
	}
}
