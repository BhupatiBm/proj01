package com.bit.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2,10};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
			}
		}
		newarr[k++]=arr[arr.length-1];
		for(int j=0;j<k;j++) {
			System.out.println(newarr[j]);
		}
	}
}


