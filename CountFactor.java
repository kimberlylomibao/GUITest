/**
 * @(#)CountFactor.java
 *
 *
 * @author 
 * @version 1.00 2015/11/9
 */

import java.util.Scanner;

public class CountFactor {	
    public static void main(String[] args) {
        int count = 0; 
    	int N = 0;
    	
    	Scanner kbd = new Scanner(System.in);
    	System.out.print("Input: "); // change label
    	N = kbd.nextInt();
    	
    	for (int i = 1; i < Math.sqrt(N); i++) {
    		if (N % i == 0) {
    			count += 2;
    		}
    	}
    	    	System.out.print("Number of Factors: " +count); // add comment
    }     
}
