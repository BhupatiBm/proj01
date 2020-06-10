package com.bit.test;

import java.util.Arrays;

public class Test3{

	public static void main(String[] args) {
		int[] arr= {1, 6, 4, 3, 2, 2, 3, 8, 1};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int sum=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				sum=sum+arr[i];
			}
		}
		sum=sum+arr[arr.length-1];
		System.out.println(sum);

	}
}


