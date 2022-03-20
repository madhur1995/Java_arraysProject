package arraysProject;

public class intersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 30, 12 };
		int b[] = { 10, 30, 12, 5, 8, 9 };
		int c[]= new int[a.length];

		for (int i = 0; i < a.length; i = i + 1) {
			if (a[i] == b[i]) {
				c[i] = a[i];
			}
		}

		for (int i = 0; i < a.length; i = i + 1) {
			System.out.println(c[i]);
		}

	}

}
