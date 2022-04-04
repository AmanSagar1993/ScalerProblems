package com.scaler.array;

import java.util.Scanner;

public class RotateArrayKTimes {
	
	public static void reverseArray(int []arr,int start,int end) {
		
		while(start<end) {
			
			arr[start] = arr[start]+arr[end];
			arr[end] = arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int arrLen=scan.nextInt();
		int arr[] = new int[arrLen];
		int k=scan.nextInt();
		
		for(int i=0;i<arrLen;i++) {
			arr[i] = scan.nextInt();
		}
		if(k>arrLen) {
			k=k%arrLen;
		}
		reverseArray(arr,0,arrLen-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, arrLen-1);
		printArray(arr);
		

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
