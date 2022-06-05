package Assignment0306;

import java.util.Scanner;
import java.util.TreeSet;

public class Q32DuplicateElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array : ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter the value of array : ");
		for(int i=0 ; i<size;i++)
			{
				arr1[i] = sc.nextInt();
			}
				
		TreeSet <Integer> t1 = new TreeSet <Integer>();
		for(int i=0;i<arr1.length;i++)
		{	
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					int temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			
				
			}
		}
		int count = 0;
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]==arr1[i+1])
				t1.add(arr1[i]);
			
		}
		
		System.out.print("Duplicate Values Are :-  ");
		for(int i : t1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Count of Duplicate Value are:- "+t1.size());
	}

}
