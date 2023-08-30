package linkedList;

import java.util.LinkedList;

public class LinkedListReverse {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

        // Add names to the linked list
        linkedList.add("Ganga");
        linkedList.add("Yamuna");
        linkedList.add("Narmada");

        // Print the linked list in reverse order
        System.out.println("Linked list in reverse order:");
        //index value 2-1
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }

	}

}
