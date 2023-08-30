package collectionHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	    public static void main(String[] args) {
	        // Create a HashMap to store student information (Roll Number, Name)
	        Map<Integer, String> studentMap = new HashMap<>();
//using key value pair eg101
	        // Adding  HashMap
	        studentMap.put(101, "reva");
	        studentMap.put(102, "sang");
	        studentMap.put(103, "uma");
	        

	        // getting from the HashMap
	        System.out.println("Student with Roll Number 103: " + studentMap.get(103));

	        // Checking if a key exists in the HashMap
	        int rollNumberToCheck = 101;
	        if (studentMap.containsKey(rollNumberToCheck)) {
	            System.out.println("Student with Roll Number " + rollNumberToCheck + " exists.");
	        } else {
	            System.out.println("Student with Roll Number " + rollNumberToCheck + " does not exist.");
	        }

	        // Updating a value in the HashMap
	        studentMap.put(103, "sri"); // Updating the name for Roll Number 103

	        // Removing an element from the HashMap
	        int rollNumberToRemove = 102;
	        if (studentMap.containsKey(rollNumberToRemove)) {
	            studentMap.remove(rollNumberToRemove);
	            System.out.println("Student with Roll Number " + rollNumberToRemove + " has been removed.");
	        } else {
	            System.out.println("Student with Roll Number " + rollNumberToRemove + " does not exist.");
	        }

	        // Displaying all elements in the HashMap
	        System.out.println("\nStudent Information:");
	        //for each we are using 
	        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
	            int rollNumber = entry.getKey();
	            String name = entry.getValue();
	            System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
	        }
	    }
	}

