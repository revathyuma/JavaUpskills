package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudent {

	public static void main(String[] args) {
		 HashMap<String, String> studentGrades = new HashMap<>();

	        // Add student names and grades to the HashMap
	        studentGrades.put("uma", "A");
	        studentGrades.put("reva", "B");
	        studentGrades.put("sri", "C");
	        studentGrades.put("sang", "B");
	        studentGrades.put("dinesh", "A");

	        // Print student names and grades
	        System.out.println("Student names and grades:");
	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Find and remove the student with the lowest grade
	        //hashmap it can store one null key and multiple null values
	        String lowestGradeStudent = null;
	        String lowestGrade = "O"; // Assume a high initial grade
	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            if (entry.getValue().compareTo(lowestGrade) < 0) {
	                lowestGrade = entry.getValue();
	                lowestGradeStudent = entry.getKey();
	            }
	        }

	        if (lowestGradeStudent != null) {
	            studentGrades.remove(lowestGradeStudent);
	            System.out.println("\nRemoved student with lowest grade: " + lowestGradeStudent);
	        }

	        // Print the updated student names and grades
	        System.out.println("\nUpdated student names and grades:");
	        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	}

}
