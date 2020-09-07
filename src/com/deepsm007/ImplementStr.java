/**
 * 
 */
package com.deepsm007;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Deep Mistry
 *
 */
public class ImplementStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(strStr("hello", "ll"));
		
	}

	public static int strStrUsingRegex(String haystack, String needle) {
        
		if(needle.isEmpty()) {
			return 0;
		}
		
		    Matcher matcher = Pattern.compile(needle).matcher(haystack);
		    // Check all occurrences
		    while (matcher.find()) {
		        return matcher.start();
		    }
		
		return -1;
		
		
    }
	
	public static int strStr(String haystack, String needle) {
		
		if(needle.isEmpty()) {
			return 0;
		}else if(haystack.contains(needle))
			return haystack.indexOf(needle);
		
		return -1;
	}
		
}
