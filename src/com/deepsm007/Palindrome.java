/**
 * 
 */
package com.deepsm007;

/**
 * @author Deep Mistry
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}

	 public static boolean isPalindrome(String s) {
		 StringBuilder sb = new StringBuilder();

			for (char c : s.toCharArray())
				if (Character.isLetter(c))
					sb.append(Character.toLowerCase(c));

			String str = sb.toString();
			int len = str.length();
			for (int i = 0; i < len / 2; i++)
				if (str.charAt(i) != str.charAt(len - 1 - i))
					return false;
			return true;
		 
	    }
	
}
