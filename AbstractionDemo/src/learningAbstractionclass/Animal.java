package learningAbstractionclass;

public interface Animal {
public void animalSound();
public void sleep();
}
 

class dog implements Animal{
	public void animalSound(){
		System.out.println("the sound bowbow");
		
	}


	@Override
	public void sleep() {
		System.out.println("ZZz");
		
	}
	 
 }
 class main{
	 public static void main(String[] args) {
		 Animal mydog = new dog();
		 mydog.animalSound();
		 mydog.sleep();
		 
	 }
	 
 }