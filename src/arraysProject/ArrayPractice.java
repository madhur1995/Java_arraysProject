package StringPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPractice {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		int sum1 = list.stream().reduce(0, (x, y) -> x + y);
		List<Integer> listOfAddedSum = list.stream().map(i -> i + sum1).collect(Collectors.toList());

		System.out.println(listOfAddedSum);

		System.out.println("Using Java 8 sum :" + sum1);

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println(sum);

		for (int i = 0; i < arr.length; i++) {
			arr[i] += sum;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
