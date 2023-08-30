package exceptionthrows;

public class ThrowsExample {
	static void throw1() throws IllegalAccessException
	{
		System.out.println("Inside throw1");
		throw new IllegalAccessException("example");
	}

	public static void main(String[] args) {
		try {
			throw1();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught" +e);
		}

	}

}
