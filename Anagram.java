package final_interview;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "bcda";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {
			char[] tochararray1 = str1.toCharArray();
			char[] tochararray2 = str2.toCharArray();

			Arrays.sort(tochararray1);
			Arrays.sort(tochararray2);

			Boolean result = Arrays.equals(tochararray1, tochararray2);
			if (result) {
				System.out.println("given string is an anagram");

			} else {
				System.out.println("given string is not an anagram");
			}

		} else {
			System.out.println("Given string are not anagram");
		}
	}

}
