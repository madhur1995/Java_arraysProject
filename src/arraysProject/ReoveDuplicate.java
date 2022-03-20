package arraysProject;

import java.util.HashSet;
import java.util.Set;

public class ReoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = { 10, 30, 12, 5, 8, 9, 8, 9, };

		Set<Integer> s = new HashSet<>(10);

		for (int t : b) {

			s.add(t);
		}

		System.out.println(s);

	}

}
