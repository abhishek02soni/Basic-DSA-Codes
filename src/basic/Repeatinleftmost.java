package basic;

import java.util.Scanner;

public class Repeatinleftmost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  S canner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) {
	  arr[i] = sc.nextInt();
  }
	for(int j=0;j<n-1;j++) {
		for(int k=0;k<n-j-1;k++) {
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

