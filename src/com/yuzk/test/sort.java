package com.yuzk.test;

public class sort {
	public static int sort(int[] arr,int low,int height){
		int pos = arr[low];
		while (low<height) {
			while(low<height && arr[height]>=pos){
				height--;
			}
			if(arr[height] <= pos)
				change(arr,height,low);
			while(low<height && arr[low] <= pos){
				low++;
			}
			if(arr[low] >= pos)
				change(arr, height, low);
		}
		return low;
	}
	public static void change(int[] arr,int i,int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	public static void quickSort(int[] arr,int low,int height){
		if(low<height){
			int middle = sort(arr, low, height);
			quickSort(arr, low, middle-1);
			quickSort(arr, middle+1, arr.length-1);
		}
	}
	public static void main(String[] args) {
		int[] arr = {12,34,2,45,21,76,4,87,33,22,34,55};
		quickSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
