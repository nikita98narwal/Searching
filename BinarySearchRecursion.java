package search;

import java.util.Scanner;

public class BinarySearchRecursion {
	static int binaryRecursion(int arr[],int low, int high, int item) {
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == item)
				return mid;
			if(arr[mid] < item)
				return binaryRecursion(arr,mid+1,high,item);
			if(arr[mid] > item)
				return binaryRecursion(arr,low,mid-1,item);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		int result = binaryRecursion(arr,0,n-1,item);
		if(result == -1)
			System.out.println("element not present");
		else
			System.out.println(result);
		sc.close();
	}
}
