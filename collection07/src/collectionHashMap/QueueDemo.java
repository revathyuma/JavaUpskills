package collectionHashMap;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue: "+numbers);
		int firstNumber = numbers.peek();
		System.out.println("First Element:" +firstNumber);
		int removedNumber = numbers.poll();
		System.out.println("Removed Element: " +removedNumber);
		System.out.println("updated Queue:" +numbers);
		

	}

}
