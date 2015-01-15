package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public abstract class Friends extends User
{
	private ArrayList<User> friends =  new ArrayList<User>();

	public void addFriend(User x){
		friends.add(x);
	}
	
	public void deleteFriend(User x){
		friends.remove(x);
	}
	
	public ArrayList getFrinds(){
		return friends;
	}
}
