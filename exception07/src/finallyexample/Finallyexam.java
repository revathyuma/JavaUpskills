package finallyexample;

public class Finallyexam {

	public static void main(String[] args) {
		int a[]= {2,8};
		int b=4;
		try {
			int x = a[2]/b-a[1];
		}
		catch (ArithmeticException e)
		{
			System.out.println("devision-by-zero");
		
		}
	catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Invalid array index");
		
		}
		finally
		{
			int y=a[1]/a[0];
			System.out.println("y="+y);
		}
	}

}
