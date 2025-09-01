
package com.emp.util;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.SecretKey;
import java.util.Date;


/**
 *@author Paramasivam Thangavel
 *@created Sep 1, 2025
**/

@Component
public class JwtUtil {
	
	private final String SECRET = "Param Raja is a good boy comming form Inida and working hard and he is a master in security";
	private final long   EXPIRATION = 1000 * 60 * 5;
	private final Key secretKey = Keys.hmacShaKeyFor(SECRET
			.getBytes(StandardCharsets.UTF_8));
	private final SecretKey sKey = Keys.hmacShaKeyFor(SECRET
			.getBytes(StandardCharsets.UTF_8));
//	private final Key secretKey = Jwts.SIG.HS256.key().build();
//	private final SecretKey sKey = Jwts.SIG.HS256.key().build();
		
	
	
	public String generateToken(String username) {
		
		System.out.println("JwtUtil.generateToken()");
		
		return 
		Jwts.builder()
		.subject(username)
		.issuedAt(new Date(System.currentTimeMillis()))
		.expiration(new Date(System.currentTimeMillis() + EXPIRATION))
		//.signWith(secretKey, SignatureAlgorithm.ES256)
		.signWith(secretKey)
		.compact();
	}
	
	public boolean validateJwtToken(String token) {
		try {
			System.out.println("Token is Good validateJweToken");
			extractUsername(token);
			return true;
		}
		catch(JwtException e) {
			System.out.println("Token is currupted");
			return false;
		}
	}
	
	public String extractUsername(String token) {
		System.out.println("extractUsername()");
	return Jwts.parser().verifyWith(sKey)
			.build()
			.parseSignedClaims(token)
			.getPayload()
			.getSubject();
	}
	

}

