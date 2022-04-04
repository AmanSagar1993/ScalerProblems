package com.scaler.array;

import java.util.Scanner;

public class SumOfPairs {
	
	public static boolean findPairs(int[] arr,int arrLen, int k) {
		
		for(int i=0;i<arrLen;i++) {
			for(int j=i+1;j<arrLen;j++) {
				if(arr[i]+arr[j]==k) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int arrLen=scan.nextInt();
		int k=scan.nextInt();
		int[] arr = new int[arrLen];
		
		for(int i=0;i<arrLen;i++) {
				arr[i]=scan.nextInt();		
		}
		
		boolean value=findPairs(arr,arrLen,k);
		System.out.println(value);
		
	}

}
