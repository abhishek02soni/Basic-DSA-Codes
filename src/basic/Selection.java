package basic;

import java.util.Scanner;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
	 for(int j=0;j<n-1; j++) {
		 int min = j;
		 for(int k=j+1;k<n;k++) {
			 if(arr[k]<arr[min]) {
				 min = k;
			 }
		 if(min!=j) {
			 int swap = arr[j];
			 arr[j] = arr[min];
			 arr[min] = swap;
		 }
		 }
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i] + " ");
	 }
	 System.out.println();
	 }
	}

}
