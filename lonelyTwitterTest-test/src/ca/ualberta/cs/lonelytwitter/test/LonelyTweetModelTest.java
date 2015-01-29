package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;


public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>{

	public LonelyTweetModelTest(){
		super(LonelyTwitterActivity.class);
	}

	
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void testSample(){
		//fail ("This is a failing test! ");
		//assertTrue("This is false", isGreaterThan(5,3));
		//assertEquals("5 is equal to 5",5,5);
	}
	
	public void testEquals(){
		Date date1 = new Date();
		Date date2 = new Date(123);
		ImportantTweetModel tweet1 = new ImportantTweetModel("Hello",date1);
		ImportantTweetModel tweet2 = new ImportantTweetModel("Hello",date2);
		NormalTweetModel normalTweet1 = new NormalTweetModel("Hello",date1);
		assertFalse("Different tweets are different", tweet1.equals(tweet2));
		assertFalse("Different tweets are different", normalTweet1.equals(tweet2));
		assertFalse("Different tweets are different", normalTweet1.equals(tweet1));
		assertFalse("Different tweets are different", tweet1.equals(normalTweet1));
	}
	
	private boolean isGreaterThan(int i , int j){
		if(i>j)
			return true;
		else
			return false;
	}

}
