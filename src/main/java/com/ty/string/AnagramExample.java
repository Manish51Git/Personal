package com.ty.string;

public class AnagramExample {
	public static void main(String[] args) {

		String str = "CHECK";
		String str1 = "HEClC";
		int count = 0;
        boolean check=false;
		if (str.length() == str1.length()) {

			for (int i = 0; i <= str.length() - 1; i++) {

				for (int j = 0; j <= str1.length() - 1; j++) {

					if (str.charAt(i) == str1.charAt(j)) {
						count++;
						check=true;
//						
					}

					if (count % 2 != 0) {
						System.out.println("not anagram");
					}
					count = 0;
				}
			}
		}
		if(check)
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}
}