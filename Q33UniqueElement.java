package Assignment0306;

import java.util.Scanner;

public class Q33UniqueElement {
	
	static void uniqueElement(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			boolean isUnique = true;
			for(int j =0;j<i;j++)
			{
				if(arr[i]==arr[j]) 
				{
					isUnique = false;
					break;
				}	
			}
			if(isUnique)
				System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int len = sc.nextInt();
		int arr1[] = new int[len];
		System.out.println("Enter Value in array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		uniqueElement(arr1,len);
		
	}

}
