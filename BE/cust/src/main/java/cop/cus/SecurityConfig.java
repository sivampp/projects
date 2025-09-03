package cop.cus;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
//	@Bean
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests()
//		.requestMatchers("/", "/login**").permitAll()
//		.anyRequest().authenticated()
//		.and()
//		.oauth2Login()
//		.defaultSuccessUrl("/cop/product",true);
//	}
//	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, JwtFillter jwtFillter) throws Exception{
		
		System.out.println("SecurityConfig.filterChain()");
	
		http.csrf(customizer -> customizer.disable())
		.authorizeHttpRequests((auth) -> auth
				.requestMatchers("/cop/**").permitAll()
				.anyRequest().authenticated())
				.oauth2Login();
				
		//.addFilterBefore(jwtFillter, UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}

}