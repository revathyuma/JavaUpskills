package inheritanceDemo;

public class Fruit {
private String name;
private String color;


public Fruit(String name, String color) {
	this.name = name;
	this.color = color;
}
public String getName() {
	return name;
}
public String getColor() {
	return color;
}
}
//sub class or child class inherit form fruit
class Apple extends Fruit{
	private String variety;
	 
	public Apple(String name, String color, String variety) {
		super(name,color);
		this.variety = variety;
	}
	public String getVariety() {
		return variety;
	}
	
}
// subclass banana inheriting from fruit
class Banana extends Fruit {
	private String origin;
	 
	public Banana(String name, String color, String origin) {
		super(name,color);
		this.origin = origin;
		
	}
	public String getOrigin() {
		return origin;
	}
}

