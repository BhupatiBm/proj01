package com.bit.test;

import java.util.Arrays;

public class Test5{

	public static void main(String[] args) {
		int[] arr= {2, 5, 1, 7, 3, 9, 5};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
			}
		}
		newarr[k++]=arr[k];
		
		System.out.print(newarr[k-1]-newarr[0] );      
	}
}

