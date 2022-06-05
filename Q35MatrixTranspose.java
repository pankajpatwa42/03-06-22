package Assignment0306;

import java.util.Scanner;

public class Q35MatrixTranspose {
	
	public static void transposeMatrix(int[][] Matrix,int matrixrow,int matrixcol)
	{
		int [][] MatrixTranspose = new int[matrixrow][matrixcol]; 
		for(int i=0;i<matrixrow;i++)
		{
			for(int j =0;j<matrixcol;j++)
			{
				MatrixTranspose[i][j] = Matrix[j][i];
			}
		}
		for(int i=0;i<matrixrow;i++)
		{
			for(int j =0;j<matrixcol;j++)
			{
				System.out.print(MatrixTranspose[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Matrix Rows : ");
		int matrixrow = sc.nextInt();
		System.out.println("Enter Number of column Rows : ");
		int matrixcol = sc.nextInt();
		int matrix[][] = new int[matrixrow][matrixcol];
		System.out.println("Enter value in matirx : ");
		for (int i=0;i<matrixrow;i++)
		{
			for (int j=0;j<matrixcol;j++)
			{
				matrix[i][j] = sc.nextInt();			
			}
		}
		transposeMatrix(matrix,matrixrow,matrixcol);
	}

}
