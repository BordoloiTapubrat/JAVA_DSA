package com.java.DP.SlidingWindow;

public class MaxSumSubArray {

	public static void main(String[] args) {
		
		System.out.println("Max Sum Subarray of size K");
		System.out.println("Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.");
		
		System.out.println();
		System.out.println();
		System.out.println(" -- Program Starts --");
		int arr[] = {2,5,1,8,2,9,1};
		
		int windowSize = 3;
		int i =0;
		int j =0;
		int k =0;
		int sum=0;
		int max = 0;
		
		while(k<arr.length)
		{
			sum+=arr[j];
			if(j-i+1==windowSize)
			{
				System.out.println(" -- Window Formed of Size 3 -- ");
				System.out.println("Array - {2,5,1,8,2,9,1}");
				System.out.println("Window Start "+arr[i]);
				System.out.println("Windows End "+arr[j]);
				System.out.println("Array Elements ");
				for(int l=i;l<=j;l++)
				{
					System.out.print(arr[l]+" , ");
				}
				System.out.println();
				System.out.println("Sum is "+sum);
				System.out.println("Existing Max is "+max);
				max = Math.max(max, sum);
				System.out.println("New Max is "+max);
				
				System.out.println(" -- Slide -- ");
				System.out.println("Subtract element at index i from sum - " +arr[i]);
				sum-=arr[i];
				System.out.println("New Temp Sum  "+sum);
				System.out.println("----- Continuing with Loop ---------");
				
				j++;
				i++;
			}
			else
			{
				System.out.println("Calculating Window - Incrementing index j - " +j);
				j++;
			}
			k++;
		}
		System.out.println();
		System.out.println("Maximum is "+max);
		

	}

}
