package learning;

public class Prime {

	public static void main(String[] args)
{
		
		int n=4;
		int count=0;

		for(int i=2;i<=n/2;i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) 
			System.out.println("It is prime number:");
			
		
		else 
			System.out.println("it is not prime number:");
	

}
}