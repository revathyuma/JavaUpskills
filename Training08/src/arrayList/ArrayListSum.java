package arrayList;

import java.util.ArrayList;

public class ArrayListSum {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

        // Add integers to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);

        // Calculate the sum of integers
        int sum = 0;
        //for each
        for (Integer num : arrayList)
        {
        	//0 +1=1,1+2=3,3+5=8
            sum += num;
        }

        
        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("Sum of integers: " + sum);
    }


	}


