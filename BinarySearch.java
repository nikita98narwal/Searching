package search;

import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(int arr[], int n, int data) {
		int low = 0;
		int high = n-1;
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == data)
				return mid;
			else if(arr[mid] < data)
				low = mid+1;
			else
				high = mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		int result = binarySearch(arr,n,item);
		if(result == -1)
			System.out.println("element not present");
		else
			System.out.println(result);
		sc.close();
	}
}
