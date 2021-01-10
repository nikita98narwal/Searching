package search;

import java.util.Scanner;

public class UnorderedLS {
	static int find(int arr[], int n, int item) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
				return -1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int item = sc.nextInt();
		int result = find(arr,n,item);
		if(result == -1)
			System.out.println("-1");
		else
			System.out.println(result);
		sc.close();
	}
}
