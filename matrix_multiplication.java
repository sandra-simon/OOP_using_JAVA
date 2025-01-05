//a java program to multiply two matrices 

import java.util.Scanner;

public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int m1,n1,m2,n2,i,j,k;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter order of 1st matrix : ");
		m1 = s.nextInt();
		n1 = s.nextInt();

		System.out.println("Enter order of 2nd matrix : ");
		m2 = s.nextInt();
		n2 = s.nextInt();

		if(n1 != m2)
		{
			System.out.print("Matrix Multiplication is not possible");
			return;
		}
		int[][] a=new int[m1][n1];
		int[][] b=new int[m2][n2];
		int[][] c=new int[m1][n2];
		
		System.out.println("Enter the elements of first matrix : ");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix : ");
		for(i=0;i<m2;i++)
		{
			for(j=0;j<n2;j++)
			{
				b[i][j] = s.nextInt();
			}
		}	
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n2;j++)
			{
				c[i][j] = 0;
				for(k=0;k<n1;k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Product is : ");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n2;j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		s.close();
	}
}
