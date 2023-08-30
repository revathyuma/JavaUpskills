package PolymorphismMethodOverriding;

public class language {
public void displayInfo() {
	System.out.println("Common English language");
	
}
}
class Java extends language {
	@Override
	public void displayInfo() {
		System.out.println("Java Programming Language");
	}
}
class main{
public static void main(String[] args) {
	Java j1=new Java();
	j1.displayInfo();
	
	language l1=new language();
	l1.displayInfo();
	
	}
}