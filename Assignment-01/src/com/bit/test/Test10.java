package com.bit.test;

import java.util.Arrays;

public class Test10{

	public static void main(String[] args) {
		int[] arr= {1, 7, 2, 9, 6};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
				
			}
		}
		
		System.out.println(arr[0]+arr[1]);

	}
}


