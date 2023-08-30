package inheritanceDemo;


public class FruitApp {
public static void main(String[] args) {
Apple apple = new Apple("Apple","Red","Fuji");
Banana banana = new Banana("Banana","Yellow","south america");
System.out.println("Apple: " + apple.getName() + ", Color:" + apple.getColor() +", Variety: "+apple.getVariety());
System.out.println("Banana: " + banana.getName() + ", Color:" + banana.getColor() +", Origin: "+banana.getOrigin());
}
}
