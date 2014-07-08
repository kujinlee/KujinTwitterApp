package main;

import twitter4j.conf.ConfigurationBuilder;

public class TwitterOauth {
	private static final String ACCESS_TOKEN = "70497316-DUjGCi43E3ptKur2kIbisyEYl9sET0vcBuZlo8KRV";
	private static final String ACCESS_TOKEN_SECRET = "aZxJ2sPCMYpjF8dpNxFRRKTp4BLbd4ZeY24lbRn7f5swU";
	private static final String CONSUMER_KEY = "go9frEe5gO2aviXlU23Q7uhAM";
	private static final String CONSUMER_SECRET = "pM5uvd3oc5w3tcDu4UujJ5q2swIbtr7kikmNi8gJ6aLyhHTYhZ";
	
	public static ConfigurationBuilder getConfigurationBuilder() {		

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setOAuthConsumerKey(CONSUMER_KEY);
		cb.setOAuthConsumerSecret(CONSUMER_SECRET);
		cb.setOAuthAccessToken(ACCESS_TOKEN);
		cb.setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);        
		return cb;
	}
}
