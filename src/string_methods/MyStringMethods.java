package string_methods;

// Starting Template
import java.util.Scanner;

public class MyStringMethods {
	private String myStr = "";

	public void readString() {
		// Prompt the user and read in a String from a Scanner class from the keyboard
		// with the nextLine() method and store it in "myStr"
		System.out.print("Enter a string: ");
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		scn.close();
		setString(s);
	}

	public void setString(String s) {
		myStr = s;
	}

	public int countOccurrences(String s) {
		// use indexOf and return the number of occurrences of the string "s" in "myStr"
		int count = 0;
		String tempStr = myStr;
		while(tempStr.indexOf(s) > -1) {
			count++;
			tempStr = tempStr.substring(tempStr.indexOf(s) + s.length());
		}
		return count;
	}

	public int countOccurrences(char c) {
		// use indexOf and return the number of occurrences of the character "c" in
		// "myStr"
		char[] charArray = new char[myStr.length()];
		charArray = myStr.toCharArray();
		int count = 0;
		for(char x : charArray) {
			if(x == c) count++;
		}
		return count;
	}

	int countUpperCaseLetters() {
		// return the number of upper case letters in "myStr"
		char[] charArray = new char[myStr.length()];
		charArray = myStr.toCharArray();
		int count = 0;
		for(char c : charArray) {
			if(c >= 'A' && c <= 'Z') count++;
		}
		return count;
	}

	int countLowerCaseLetters() {
		// return the number of lower case letters in "myStr"
		char[] charArray = new char[myStr.length()];
		charArray = myStr.toCharArray();
		int count = 0;
		for(char c : charArray) {
			if(c >= 'a' && c <= 'z') count++;
		}
		return count;
	}

	public void printCounts(String s, char c) {
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr=" + myStr);
		System.out.println("Number of Upper case letters=" + countUpperCaseLetters());
		System.out.println("Number of Lower case letters=" + countLowerCaseLetters());
		System.out.println("Number of " + s + " is " + countOccurrences(s));
		System.out.println("Number of " + c + " is " + countOccurrences(c));
	}

	public static void main(String[] args) {
		MyStringMethods msm = new MyStringMethods();
		msm.readString();
		msm.printCounts("big", 'a');

		msm.setString("Parked in a van down by the river bank .... The van evan vanished near a lot of other vans");
		msm.printCounts("van", 'a');

		MyStringMethods msm2 = new MyStringMethods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}
}
