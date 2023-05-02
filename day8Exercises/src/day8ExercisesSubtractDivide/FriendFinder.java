package day8ExercisesSubtractDivide;

import java.util.Collections;
import java.util.Vector;

public class FriendFinder{
	public static int findFriend(Vector<FriendshipCriteria<String,Integer>> friends, 
		

		FriendshipCriteria<String,Integer> f){ {
	return Collections.binarySearch(friends, f); 
	}}

/**
 * Helper method to create a friends database
 * @param args
 */
protected static void createDb(Vector<FriendshipCriteria<String,Integer>> list)
{
	list.add(new FriendshipCriteria<String,Integer>(new String("ABC DEF"), 
			new Integer(30)));
	list.add(new FriendshipCriteria<String,Integer>(new String("XYZ MNO"), 
			new Integer(40)));
}
public static void main(String[] args) {
//	Creating a friendship criteria
	Vector<FriendshipCriteria<String, Integer>> list = 
			new Vector<FriendshipCriteria<String, Integer>>();
	FriendFinder.createDb(list);
	
	FriendshipCriteria<String,Integer> f= 
			new FriendshipCriteria<String, Integer>("ABC DEF",30);
	int ret_val = FriendFinder.findFriend(list, f);
	if (ret_val<0) {
		System.out.println("Item not found");
	}else {
		System.out.println("Item mil gayi");
	}
}}
