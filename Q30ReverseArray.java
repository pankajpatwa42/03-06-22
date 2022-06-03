package Assignment0306;

import java.util.Scanner;

public class Q30ReverseArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the length of Array :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter the value for Array :");
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Original array : ");
		for (int i =0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of Array : ");
		for(int i = arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+ " ");
		}
	}

}
