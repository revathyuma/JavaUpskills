package multithreading;


class ThreadX extends Thread{
	public void run  (   ) {      //run method created
	for(int i=1;i<=3;i++) {
		System.out.println("Thread1:" +i);
	}
	System.out.println("Exit from Thread1");
}
}
class ThreadY extends Thread
{
	public void run (  )
	{
		for(int j=1;j<=3;j++) {
			System.out.println("Thread2:" +j);
		}
		System.out.println("Exit from Thread2");
	}

	}



public class ThreadExample {

	public static void main(String[] args) {
		new ThreadX().start();
		new ThreadY().start();

	}

}
