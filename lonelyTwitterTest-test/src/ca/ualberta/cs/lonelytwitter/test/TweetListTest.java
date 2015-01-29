package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetList;
import android.test.ActivityInstrumentationTestCase2;


public class TweetListTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>{

	public TweetListTest(){
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void testTweetList(){
		TweetList tweetslist = new TweetList();
		ArrayList<LonelyTweetModel> tweets = tweetslist.getTweets();
		assertNotNull("Tweet List not initialised",tweetslist.getTweets());
	}
	
	public void testCounts(){
		TweetList tweetList = new TweetList();
		NormalTweetModel tweet = new NormalTweetModel("Hello"); 
		tweetList.addTweet(tweet);
		assertEquals("This should be zero",1, tweetList.getCounts());
	}
	


}
