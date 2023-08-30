package ploymorphismMethodOverloading;

public class Polygen {
public void render() {
	System.out.println("Rendering polygen..");
}
}
class Square extends Polygen{
	public void render() {
		System.out.println("Rendering Square..");
	}
	}
class Circle extends Polygen{
	public void render()  {
		System.out.println("Rendering Circle...");
	}

class main {
	public static void main(String[] args) {
		Square s1 =new Square();
		s1.render();

		Circle c1=new Circle();
		c1.render();
	}

	}
}