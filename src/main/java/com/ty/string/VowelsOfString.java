package com.ty.string;

public class VowelsOfString {
	public static void main(String[] args) {
		String str = "Manish";
		str = str.toUpperCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if (charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
