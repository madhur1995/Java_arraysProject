package StringPackage;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 1, 1,1 };
		int result = 0;
		int k = 2;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					result++;

				}
			}

		}
		System.out.println(result);
	}

}
