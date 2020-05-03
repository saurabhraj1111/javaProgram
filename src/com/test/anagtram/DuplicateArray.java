package com.test.anagtram;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2,2, 3, 4, 3, 3, 5, 5,5,6, 7, 8,4 };
		findDuplicate(arr);

	}

	private static void findDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		// sort
		Arrays.sort(arr);
		int len = arr.length;
		
		int[] repArr = new int[len];
		int count = 0;
		int uniCount=0;
		// find duplicate
		for (int p = 0; p < len; p++) {
			for (int q = p + 1; q < len; q++) {
				if(arr[p]!=-1 && arr[q]!=-1){
				if(arr[p]==arr[q] && p!=q){
					//System.out.println(arr[p]);
					//arr[q]=-1;
					repArr[count++]=arr[q];
				}		
				}
			}
		}
		
		//make distinct
		for(int k=0;k<count-1;k++){
			if(repArr[k]!=repArr[k+1]){
				repArr[uniCount++]=repArr[k];
			}
		}
		//add last 
		repArr[uniCount]=repArr[count-1];
		
		
		for (int p=0;p<=uniCount;p++) {
			System.out.println(repArr[p]);
		}
	}
}
