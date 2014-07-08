package test;

import java.util.List;

import main.TwitterSearch;

import org.junit.Assert;
import org.junit.Test;

public class TwitterSearchTest {

	@Test
	public void testGetSearchResultsSanJose() {
		// San Jose
		// private static final double LAT = 37.2970156D;
		// private static final double LONG = -121.8174129D;
		List<String> results = TwitterSearch.getSearchResults("Tom Cruise",
				37.2970156D, -121.8174129D);

		Assert.assertNotNull(results);
		
		System.out.println("\n===== San Jose Results =====");
		for (String txt : results) {
			System.out.println(txt);
		}
	}
	@Test
	public void testGetSearchResultsLosAngeles() {
		// Los Angeles
		// private static final double LAT = 33.959012D;
		// private static final double LONG = -118.308736D;
		List<String> results = TwitterSearch.getSearchResults("Tom Cruise",
				33.959012D, -118.308736D);

		Assert.assertNotNull(results);
		
		System.out.println("\n===== Los Angeles Results =====");
		for (String txt : results) {
			System.out.println(txt);
		}
	}
}
