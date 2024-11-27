package com.rox.securityEx.config;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.autoconfigure.web.ServerProperties.Reactive.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securutFilterChain(HttpSecurity http) throws Exception {
		
		return http
		.csrf(customizer -> customizer.disable())
		.authorizeHttpRequests(request -> request.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.sessionManagement(Session -> 
		 Session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		
		//http.formLogin(Customizer.withDefaults());
		
		.build();
	}

}
