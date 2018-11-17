package core;

public class ArraySort {
	//Bubble Sort Logic
	public static void main(String[] args) {
		int[] ar = {3,5,1,4,2};int temp;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j] > ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		
	}
}
