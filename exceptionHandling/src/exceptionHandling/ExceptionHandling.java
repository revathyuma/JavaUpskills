package exceptionHandling;
import java.lang.Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
        int number = 5; 
        try {
            checkIfOdd(number);
            System.out.println(number + " is even.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkIfOdd(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception(number + " is an odd number!");
        }
    }
}

