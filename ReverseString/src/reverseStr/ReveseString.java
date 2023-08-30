package reverseStr;

import java.util.Scanner;

public class ReveseString {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder reveseString = new StringBuilder(str);
        reveseString.reverse();
        String name = reveseString.toString();
        System.out.println("ReveseString:" +name);

	}

}
