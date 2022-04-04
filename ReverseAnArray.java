package com.scaler.array;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arrLen=scan.nextInt();
		int[] arr=new int[arrLen];
		
		int start=0;
		int end=arrLen-1;
		
		for(int i=0;i<arrLen;i++) {
			arr[i] = scan.nextInt();	
		}
		
		while(start<end) {	
			//swaping the values
			arr[start] = arr[start]+ arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			start++;
			end--;
		}
		
		for(int i=0;i<arrLen;i++) {
			System.out.print(arr[i]);	
		}
		

	}

	

}
