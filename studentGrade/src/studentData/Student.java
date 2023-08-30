package studentData;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the student's grade: ");
		        char grade = scanner.next().charAt(0);
		        
		        switch (grade) {
		            case 'A':
		            case 'a':
		                System.out.println("Excellent!");
		                break;
		            case 'B':
		            case 'b':
		                System.out.println("Good job!");
		                break;
		            case 'C':
		            case 'c':
		                System.out.println("You can do better.");
		                break;
		            case 'D':
		            case 'd':
		                System.out.println("Needs improvement.");
		                break;
		            case 'F':
		            case 'f':
		                System.out.println("You've failed.");
		                break;
		            default:
		                System.out.println("Invalid grade.");
		                break;
		        }
		        
		        scanner.close();
		    }
		
	}

