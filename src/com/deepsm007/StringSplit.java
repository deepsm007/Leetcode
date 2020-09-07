package com.deepsm007;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.swing.text.DefaultEditorKit.CutAction;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class StringSplit {

    /*
     * Complete the 'cutFilms' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY inputList as parameter.
     */
	public static List<Integer> cutFilms(List<String> inputList) {
	    // Write your code here
	        int x=0, y=0,z=0 ;
	        String S = "";
	        for(String s:inputList) {
	        	S = S + s;
	        }
	        List<Integer> arr = new ArrayList<>();
	        
	            if(S.length()==0) return arr;
	            
	            for(int i=0; i<S.length();i++){
	                char c = S.charAt(i);
	                y = S.lastIndexOf(c);
	                String temp = S.substring(i,y+1);
	                for(int j=1;j<y;j++){
	                    char d = S.charAt(j);
	                    y = Math.max(y, S.lastIndexOf(d));
	                }
	                i = y;
	                if(x==0) arr.add(y);
	                else arr.add(y-z);
	                z+=arr.get(x);
	                x++;
	            }
	            arr.add(0,arr.get(0)+1);
	            arr.remove(1);
	            return arr;
	    }
    public static void main(String[] args) throws IOException {
       List<String> inputList = new ArrayList<String>();
       inputList.add("a");
       inputList.add("b");
       inputList.add("a");
       inputList.add("b");
       inputList.add("c");
       inputList.add("b");
       inputList.add("a");
       inputList.add("c");
       inputList.add("a");
       inputList.add("d");
       inputList.add("e");
       inputList.add("f");
       inputList.add("e");
       inputList.add("g");
       inputList.add("d");
       inputList.add("e");
       inputList.add("h");
       inputList.add("i");
       inputList.add("j");
       inputList.add("h");
       inputList.add("k");
       inputList.add("l");
       inputList.add("i");
       inputList.add("j");
       
    	System.out.println(  cutFilms(inputList));
     
    	
    	
    }
    
}

