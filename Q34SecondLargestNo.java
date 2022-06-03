package Assignment0306;

import java.util.Scanner;

public class Q34SecondLargestNo {

	public static void main(String[] args) {
		System.out.println("Enter the length of Array :");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter the value for Array :");

//		int temp[] = new int[size];
		
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0 ;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
			System.out.println(arr1[size-2]+ " ");
		
	}

}
