package Assignment0306;

import java.util.Scanner;

public class Q31CopyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int len = sc.nextInt();
		int arr1[] = new int[len];
		System.out.println("Enter Value in array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
;		}
		
		int arr2[] = new int[arr1.length];
		
		System.out.println("Array copy element : ");
		
		for(int i =0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
			System.out.print(arr2[i]+" ");
		}
	}

}
