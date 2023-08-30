package abstractionclass;

 abstract class animals {
  public abstract void animalSound();
  public void sleep() {
	  System.out.println("the sound ZZZ");
	  
  }
  
}
    class pig extends animals {
	public void animalSound() {
		System.out.println("the pig sound wewe");
	}
	
}
    class Main {
    	  public static void main(String[] args) {
    	    animals myPig = new pig();
    	    myPig.animalSound();
    	    myPig.sleep();
    	  }
    	}