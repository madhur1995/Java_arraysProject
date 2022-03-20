package arraysProject;

public class RotationArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };
		int n = a.length;
		int k = 1;
		int temp;

		/*
		 * int b[] = new int[k];
		 * 
		 * System.arraycopy(a, 3, b, 0, 2); for (int i = 0; i < b.length; i++) {
		 * System.out.println(b[i]); }
		 */

		temp = a[n - 1];
		for (int i = n - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;

		for (int j = 0; j < n; j++) {
			System.out.print(a[j] + " ");
		}

	}

}
