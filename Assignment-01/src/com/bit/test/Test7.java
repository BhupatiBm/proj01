package com.bit.test;

import java.util.Arrays;
import java.util.spi.LocaleNameProvider;

public class Test7{

	public static void main(String[] args) {
		int[] arr= { 1, 2, 5, 9, 6, 4, 7, 2};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
			}
		}
		newarr[k++]=arr[arr.length-1];

		System.out.println("Second max:"+newarr[k-2]+",Second min:"+newarr[1]);


	}
}

