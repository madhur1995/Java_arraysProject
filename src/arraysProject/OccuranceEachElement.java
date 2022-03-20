package arraysProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayElementCount(new int[] { 4, 5, 4, 5, 4, 6 });

	}

	static void arrayElementCount(int inputArray[]) {
		// Creating a HashMap object with elements of inputArray as keys and their count
		// as values
		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
		// checking every element of the inputArray
		for (int i : inputArray) {
			if (elementCountMap.containsKey(i)) {
				// If element is present in elementCountMap, incrementing it's count by 1
				elementCountMap.put(i, elementCountMap.get(i) + 1);
			} else {
				// If element is not present in elementCountMap,
				// adding this element to elementCountMap with 1 as it's value
				elementCountMap.put(i, 1);
			}
		}
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		System.out.println("Element Count : " + elementCountMap);
		
		for(Entry<Integer, Integer>  obj:elementCountMap.entrySet()) 
		{
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
	}
	

}
