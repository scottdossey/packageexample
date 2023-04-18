//Sometimes there are multiple classes with the same name,
//you need to make sure you import the right one.

import com.tts.helper.Utility;

public class Example {
	public static void main(String[] args) {
		Utility myUtility = new Utility();
		
		//I can also avoid importing by fully refering
		//to the fullname (including package) of a class.
		java.util.List<String> myList = new java.util.ArrayList<>();

		//We can use the full names when we want to use two different classes
		//with the same name from two different packages.
		
		com.tts.utility.Utility myUtility2; //Two Utility classes from two different packages
		com.tts.helper.Utility myUtility3;
		
	}
	
}
