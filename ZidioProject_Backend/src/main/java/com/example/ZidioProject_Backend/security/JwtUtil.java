//package com.example.ZidioProject_Backend.security;
//
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
//import org.springframework.stereotype.Component;
//
//import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;
//
//@Component
//public class JwtUtil {
// 	private final String SECRET_KEY = "secrete_key";
	
	
// 	public String generateToken(String email) {
// 		return jwts.builder().
// 				setSubject(email).
// 				setIssueAt(new Date()).
// 				setExpiration(new Data(System.currentTimeMillis()+2000)).
// 				setWith(SignatureAlgorithm.HS256.SECRET_KEY).
// 				compact();
// 	}
	
// 	public String extractEmail(String token) {
// 		return Jwt.parser().
// 				setSigningKey(SECRET_KEY).
// 				parseClaimjws(token).
// 				getBod().
// 				getSubject();
// 	}
// }
//
//
//    public boolen validateToken(String token)
//    {
//        try(
//            jwts.parser().setSigningKey(SECRET).parseClaimsJws(token);
//            return true;
//        )
//        catch (JwtExcetion | IllegalArgumentException e) {
//            return false;
//        }
//    }
//}