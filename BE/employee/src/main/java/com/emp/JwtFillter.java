
package com.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.emp.util.JwtUtil;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *@author Paramasivam Thangavel
 *@created Sep 1, 2025
**/

@Component
public class JwtFillter extends OncePerRequestFilter {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Override
	protected void doFilterInternal(
										HttpServletRequest request,
										HttpServletResponse response,
										FilterChain filterChain
									) throws ServletException, IOException
	{
		System.out.println("JwtFillter.doFilterInternal() ");
		String authHeader = request.getHeader("Authorization");
		if(authHeader != null && authHeader.startsWith("Bearer ")) {
			String token = authHeader.substring(7);
			if(jwtUtil.validateJwtToken(token)) {
				String username = jwtUtil.extractUsername(token);
				var auth = new UsernamePasswordAuthenticationToken(username, null, List.of());
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		}
		
		filterChain.doFilter(request, response);
	}
	

}

