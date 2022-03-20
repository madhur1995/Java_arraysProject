package arraysProject;

public class arrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 30, 12 };
		int b[] = { 10, 30, 12, 5 };
		boolean result = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i = i + 1) {
				if (a[i] != b[i]) {
					
					result = false;
				}
			}
		} else {
			
			result = false;
		}

		if (result == true) {

			System.out.println("Arrays are equal");
		} else {

			System.out.println("Arrays are not equal");
		}
	}

}
