/**
 * 
 */
package com.deepsm007;

import java.util.Arrays;

/**
 * @author Deep Mistry
 *
 */
public class Array {

	public static void main(String[] args) {
		
		//Answer #1
		int[] nums = {0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
		
		//Answer #2
		int[] numbers = {12,345,2,6,7896};
		System.out.println(findNumbers(numbers));
	
		//Answer #3
		int[] sq = {-4,-1,0,3,10};
		System.out.println(sortedSquares(sq));
		
		//Answer #4
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
		for(int i:arr) System.out.print(arr[i]);
		
		String binary = Integer.toString(5, 2);
		
	}
	
	/**
	 * Leetcode #1
	 * @param nums
	 * @return
	 */
	public static int findMaxConsecutiveOnes(int[] nums) {
        int consecOne = 0,count =0;
        for(int i:nums){
            if(i == 1){
                ++count;
            }else{
                count = 0 ;
            }
            if(count > consecOne)
                consecOne = count;
        }
        return consecOne;
    }
	
	/**
	 * Leetcode #2
	 * @param nums
	 * @return
	 */
	 public static int findNumbers(int[] nums) {
	        int even=0;
	        for(int i:nums){
	            if(len(i) % 2 ==0){
	                ++even;
	            }
	        }
	        return even;
	    }
	    public static int len(int n){
	        return (n<100000)?((n<100)?((n<10)?1:2):(n<1000)?3:((n<10000)?4:5)):((n<10000000)?((n<1000000)?6:7):((n<100000000)?8:((n<1000000000)?9:10)));
	    }
	
	 /**
	  * Leetcode #3   
	  * @param A
	  * @return
	  */
	 public static int[] sortedSquares(int[] A) {
	     int[] sq  = new int[A.length];  
		 for(int i=0;i<A.length;i++) {
			 sq[i]=A[i]*A[i];
		 }
		 Arrays.sort(sq);
		 return sq;
	 }
	 
	 /**
	  * Leetcode #4
	  * @param arr
	  */
	 public static void duplicateZeros(int[] arr) {
		 int[] result = new int[arr.length];
	        int index = 0;
	        for(int i = 0;i<result.length;i++){
	            if(arr[index]!=0){
	                result[i] = arr[index];
	            }else{
	                result[i]=0;
	                if(i+1<result.length){
	                    result[i+1]=0;
	                    i = i+1;
	                }
	            }
	            index++;
	        }
	        for(int i = 0;i<result.length;i++) 
	        	arr[i] = result[i];
	 }
}
