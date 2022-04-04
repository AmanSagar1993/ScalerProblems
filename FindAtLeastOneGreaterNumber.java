package com.scaler.array;

import java.util.Scanner;

public class FindAtLeastOneGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int arrLen=scan.nextInt();
		int count=0;
		int arr[] = new int[arrLen];
		for(int i=0;i<arrLen;i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		
		for(int i=1;i<arrLen;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}	
		}
		
		for(int i=0;i<arrLen;i++) {
			if(max == arr[i]) {
				count++;
			}	
		}
		System.out.println("Count is: "+(arrLen-count));
	}
	
	//Time Complexity : O(N), Space Complexity: O(1)

}
