package main;

import java.util.ArrayList;
import java.util.List;


import twitter4j.GeoLocation;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterSearch {

	private static final int MAX_TEXT_NUM = 5;
	private static final int RADIUS = 15;

	public static List<String> getSearchResults(String searchStr,
			double latitude, double longitude) {
		List<String> twitterList = new ArrayList<String>();
		try {
			ConfigurationBuilder cb = TwitterOauth.getConfigurationBuilder();
			Twitter twitter = new TwitterFactory(cb.build()).getInstance();
			Query query = new Query(searchStr);
			query.count(MAX_TEXT_NUM);
			query.setGeoCode(new GeoLocation(latitude, longitude), RADIUS, Query.MILES);

			QueryResult result = twitter.search(query);
			List<Status> tweets = result.getTweets();
			for (int i = 0; i < tweets.size(); i++) {
				twitterList.add(tweets.get(i).getText());
			}
		} catch (TwitterException te) {
			System.out.println("Couldn't connect: " + te);
		}
		return twitterList;
	}

}
