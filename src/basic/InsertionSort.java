package basic;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int arr[] = new int[n];
  for(int i=0;i<n;i++) {
	  arr[i] = sc.nextInt();
  }
	for(int i=1;i<n;i++) {
		int temp = arr[i];
		int j=i-1;
	while(j>=0 && arr[j]>temp) {
		arr[j+1] = arr[j];
		j--;
	}
	arr[j+1] = temp;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	}
}
