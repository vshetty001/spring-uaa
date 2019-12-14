package com.mudra.springbootrest;

import java.util.ArrayList;
import java.util.List;

public class AWSUserCredential {

	private String user;
	private String accessKey;
	private String secretKey;
	private String region;
	private List<String> buckets = new ArrayList<>();

	public List<String> getBuckets() {
		return buckets;
	}

	public void setBuckets(List<String> buckets) {
		this.buckets = buckets;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "AWSUserCredential [user=" + user + ", accessKey=" + accessKey + ", secretKey=" + secretKey + ", region="
				+ region + ", buckets=" + buckets + "]";
	}


}
