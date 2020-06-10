package com.bit.test;

import java.util.Arrays;
import java.util.spi.LocaleNameProvider;

public class Test6{

	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		Arrays.sort(arr);
		int[] newarr=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;++i) {
			if(arr[i] != arr[i+1]) {
				newarr[k++]=arr[i];
			}
		}
		newarr[k++]=arr[arr.length-1];

		System.out.println("max:"+newarr[0]+",min:"+newarr[0]);


	}
}

