package com.bit.test;

public class Test9 {

	public static void main(String[] args) {
		int[] arr= {3, 6, 8, -8, 10, 8 };
		int sum=16;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
						System.out.print("("+arr[i]+","+arr[j]+")  ");
				}
			}
		}
	}
}

