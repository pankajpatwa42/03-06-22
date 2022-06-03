package Assignment0306;

import java.util.Scanner;

public class Q32DuplicateElement {

	static void duplicateElement()
	{
		
	}
	public static void main(String[] args) {
		int size ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array :");
		size = sc.nextInt();
		int arr1[] = new int[size];
		int duplicate[]=new int[size];
		System.out.println("Enter the Value : ");
		for(int i = 0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		int duplielement =0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j =i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
					duplicate[i] = arr1[i];
					
					
			}
		}
		System.out.println("Total no. of Duplicate element in array is "+duplicate.length);
	}

}
