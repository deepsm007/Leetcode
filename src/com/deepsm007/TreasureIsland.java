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
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TreasureIsland {

    /*
     * Complete the 'numTruck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY grid as parameter.
     */

	public static int numTruck(List<List<Integer>> grid) {
	    // Write your code here
	        if(grid == null || grid.size() ==0){
	            return 0;
	        }
	        int count =0;
	        for(int i= 0; i<grid.size();i++){
	            for(int j=0;j<grid.get(0).size();j++){
	                if(grid.get(i).get(j) == 1){
	                	dfs(grid,i,j);
	                	count+=1;
	                }
	            }
	        }
	        return count;
	    }
	    public static void dfs(List<List<Integer>> grid, int i,int j){
	        if(i<0 || j<0 || i>=grid.size() || j>=grid.get(0).size() || grid.get(i).get(j) != 1){
	            return;
	        }
	        List<Integer> el = new ArrayList<Integer>();
	        grid.get(i).set(j, 0);
	        
	        dfs(grid, i+1,j); //next row same col
	        dfs(grid,i-1,j); // prev row same col
	        dfs(grid,i,j+1); // same row next col
	        dfs(grid,i,j-1); // same row prev col
	        
	    }
public static void main(String[] args) throws IOException {
	List<List<Integer>> grid = new ArrayList<List<Integer>>();
	List<Integer> row = new ArrayList<>();
	row.add(1);
	row.add(0);
	row.add(0);
	row.add(0);
	grid.add(row);
	List<Integer> row1 = new ArrayList<>();
	row1.add(0);
	row1.add(1);
	row1.add(0);
	row1.add(0);
	grid.add(row1);
	List<Integer> row2 = new ArrayList<>();
	row2.add(0);
	row2.add(0);
	row2.add(1);
	row2.add(0);
	grid.add(row2);
	List<Integer> row3 = new ArrayList<>();
	row3.add(0);
	row3.add(0);
	row3.add(0);
	row3.add(1);
	grid.add(row3);
//	List<Integer> row4 = new ArrayList<>();
//	row4.add(1);
//	row4.add(1);
//	row4.add(1);
//	row4.add(1);
//	grid.add(row4);
	for(int i=0;i<grid.size();i++) {
		for(int j=0;j<grid.get(i).size();j++) {
			System.out.print(grid.get(i).get(j));
		}
		System.out.println();
	}
	System.out.println(numTruck(grid));
	
}

}

