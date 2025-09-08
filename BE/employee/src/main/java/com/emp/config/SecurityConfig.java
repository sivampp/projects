package com.emp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.emp.JwtFillter;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
//	@Bean
//	public SecurityFilterChain securityFliterCain(HttpSecurity http)  throws Exception {
//		
////		http.csrf(customizer -> customizer.disable());
////		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
////		//http.formLogin(Customizer.withDefaults());
////		http.httpBasic(Customizer.withDefaults());
////		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
////		return http.build();
//		
//		//the above one is same as bellow one.
//		
//		
//	return	http.csrf(customizer -> customizer.disable())
//			.authorizeHttpRequests(request -> request.anyRequest().authenticated())
//			//http.formLogin(Customizer.withDefaults());
//			.httpBasic(Customizer.withDefaults())
//			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//			.build();
//		
//		
//	}
	

	
	@Bean
	public PasswordEncoder passwordEncoder() throws Exception{
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, JwtFillter jwtFillter) throws Exception{
		
		System.out.println("SecurityConfig.filterChain()");
	
		http.csrf(customizer -> customizer.disable())
		.authorizeHttpRequests((auth) -> auth
				.requestMatchers("/login/v1").permitAll()
				.requestMatchers("/auth/**").hasRole("ADMIN")
				.requestMatchers("/user/**").authenticated()
				.anyRequest().authenticated())
		.addFilterBefore(jwtFillter, UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}