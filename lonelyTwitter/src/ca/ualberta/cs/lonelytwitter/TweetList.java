package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetList{
	private ArrayList<LonelyTweetModel> tweetList;
	private int count;
	
	public TweetList(){
		tweetList = new ArrayList<LonelyTweetModel>();
		count = 0;
	}
	
	public ArrayList<LonelyTweetModel> getTweets(){
		// TODO Auto-generated constructor stub
		return tweetList;
	}

	public int getCounts(){
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet){
		count++;
		tweetList.add(tweet);
	}
}
