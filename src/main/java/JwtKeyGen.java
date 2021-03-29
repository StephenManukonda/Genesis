import io.jsonwebtoken.Claims;

public class JwtKeyGen {
	public static void main(String args[]) {
		String secret="SECRET";

		
		JwtTUtils util =new JwtTUtils();
		String token =util.generateToken("ABS", "steve", secret);
		
		Claims abs=util.getClaimns(secret, token);
		System.out.println(abs.getIssuedAt());
	
		System.out.println(util.getSubject(secret, token));
		System.out.println(" Is valid token " + util.isValidToken(token, secret));
		
		
		
		
	}

}
