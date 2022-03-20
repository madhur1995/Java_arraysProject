package arraysProject;

public class secondLargest {

	public static void main(String[] args) {
		int[] arrayOne = { 2, 5, 1, 7, 4 };
		int size=arrayOne.length;
		int temp;

		for (int i = 0; i < arrayOne.length - 1; i++) {
			for (int j = 0; j < arrayOne.length - i - 1; j++) {
				if (arrayOne[j] > arrayOne[j + 1]) {
					temp = arrayOne[j];
					arrayOne[j] = arrayOne[j + 1];
					arrayOne[j + 1] = temp;
				}
			}

		}
		for (int i = 0; i < arrayOne.length; i++) {
			System.out.print(arrayOne[i]+" ");
		}
		System.out.println("Second Largest element is :"+arrayOne[size-2]);
	}

}
