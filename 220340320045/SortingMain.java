//Q1: Sorting

import java.util.*;

public class SortingMain{	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				
		}
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] arr){
		
		for(int i=arr.length-1;i>0;i--){
			int key=arr[i];
			int j=i-1;
			while(j>0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			
		System.out.println(Arrays.toString(arr));
			arr[j+1]=key;
			
			
		}
	}
}