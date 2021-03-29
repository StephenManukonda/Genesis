import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtTUtils {
	
	// generate token 
	public String generateToken(String id, String subject, String key) {
		
		return Jwts.builder().setId("ABS")
				.setSubject(subject)
				.setIssuer("Steve")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(key.getBytes()))
				.compact();
		
	}
	// return claims 
	public Claims getClaimns(String key, String token) {
		
		return Jwts.parser().setSigningKey(Base64.getEncoder().encode(key.getBytes()))
				.parseClaimsJws(token)
				.getBody();
		
	}
	
	public String getSubject(String key, String token) {
		
		return getClaimns(key, token).getSubject();
		
	}
	
	// Is valid token
	
	public boolean isValidToken(String token, String key) {
		
		return getClaimns(key, token).getExpiration().after(new Date(System.currentTimeMillis()));
		
		
	}

}
