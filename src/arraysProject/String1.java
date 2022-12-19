package StringPackage;

public class String1 {

	public static void main(String[] args) {

		// Upper to Lower L to U in a siring

		StringBuffer s = new StringBuffer("MaDhUr");

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				char toUpper = (char) (c - 32);
				s.setCharAt(i, toUpper);
			} else {
				char toLower = (char) (c + 32);
				s.setCharAt(i, toLower);
			}
		}

		System.out.println(s);

	}

}
