package com.mudra.springbootrest;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeswtCFController {
	
	
	@GetMapping(path="/aws/s3",produces = {"application/json"})
	public AWSUserCredential getS3Credentials() {
		
		AWSUserCredential userCred = new AWSUserCredential();
		userCred.setAccessKey("akey");
		userCred.setBuckets(Arrays.asList("buck1", "buck2", "buck3"));
		userCred.setSecretKey("asecret");
		userCred.setRegion("uswest");
		userCred.setUser("auser");
		
		System.out.println("Calling api get S3 Credss");
		return userCred;
	}
	
}
