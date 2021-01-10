package search;

import java.util.Scanner;

public class OrderedLS {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int low=0,high=n-1,mid,f=1;
			while(low<=high)
			{
				mid=low+(high-low)/2;
				if (arr[mid]==x)
				{
					System.out.println(mid);
					f=0;
					break;
				}
				else if(x>arr[mid])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			if(f==1)
			{	if(arr[0]<x)
				for(int i=0;i<n;i++)
				{
					
					if(arr[i]>x)
					{
						System.out.println(i-1);
						break;
					}
				}
				else
				System.out.println("-1");
			}
		}
		sc.close();	
	}
}
