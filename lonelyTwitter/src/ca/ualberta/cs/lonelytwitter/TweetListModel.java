package ca.ualberta.cs.lonelytwitter;


public class TweetListModel{
	private ArrayList<TweerList> tweetlist;
	
	public TweetListModel(){
		tweetlist
	}
	
    public void addTweet(LonelyTweetModel tweet) throws IllegalArgumentException{// when a tweet that equals() one of the tweets in the list is added.
    	
    }
    
    public LonelyTweetModel[] getTweets(){//should return all tweets in the order they were added
    	return tweetList
    }
    		
    public boolean hasTweet(LonelyTweetModel){// should return true/false a tweet that equals() this one is already in the list
    	
    }
    
    public void removeTweet(LonelyTweetModel){// should remove a tweet
    	
    }
    
    public int getCount(){// should accurately count the number of tweets in the list
    	
    }
}
