package arrays;

import java.util.Arrays;

/*
 find max 
 public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int max=0;
		
		for(int x : arr) {
			if(max < x) {
				max=x;
			}
			
		}
		System.out.println(max);
	}
	
	2.find the occurence of the given number
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,1,1,1};
		int count=0;
		int num=1;
		
		for(int x : arr) {
			
			if(num==x) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

 */
public class Logical_Questions {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,1,1,1,6,23,35,21};
		
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}System.out.println();
		}
	}

}
