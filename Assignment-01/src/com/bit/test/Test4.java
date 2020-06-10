package com.bit.test;

import java.util.Arrays;

public class Test4{

	public static void main(String[] args) {
		int[] arr= {6, 8, 1, 9, 2, 1, 10};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0,temp=0,j=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
			}
		}
		newarr[k++]=arr[arr.length-1];
		int[] revarr=new int[arr.length];
		for(int i=k-1;i>=0;i--) {
			revarr[j++]=newarr[i];

		}
		System.out.print(revarr[2] );      
	}
}
