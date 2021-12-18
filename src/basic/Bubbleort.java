package basic;

import java.util.Scanner;

public class Bubbleort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {4,5,1,3,2};
   for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i] + " ");   
   }
	for(int j=0; j<arr.length-1;j++) {
		for(int k=0;k<arr.length-j-1;k++) {
			if(arr[k]>arr[k+1]) {
				int swap = arr[k];
				arr[k] = arr[k+1];
				arr[k+1] = swap;
			}
		}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		System.out.println();
	}
	}

}
