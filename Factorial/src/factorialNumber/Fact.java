package factorialNumber;

import java.util.Scanner;

public class Fact {
	

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();//in scanner always brings in string so we are giving nextInt(Typeconverstion)
		int a=1;
		while(num!=0)
		{
			
			a=a*num;
			num=num-1;
		}
		System.out.println("Factorial: "+a);

	}

}
