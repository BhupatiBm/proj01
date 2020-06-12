package com.bit.test;

public class Test1 {
	
	void doRun(){

//feature 03 added	
		
		
	}
	void doCopy(){

		//feature 04 added
	
	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
				}
			}
		}
	}
}

