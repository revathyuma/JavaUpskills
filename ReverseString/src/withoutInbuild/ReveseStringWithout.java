package withoutInbuild;

import java.util.Scanner;

public class ReveseStringWithout {

	public static void main(String[] args) {
		System.out.println("Enter the name:");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String reveseString = " ";
		for(int i=str.length()-1;i>=0;--i) {
	          reveseString+=str.charAt(i);
		}
		System.out.println("ReveseString:"+reveseString);	
	}

}
