//a java program to multiply two matrices 

import java.util.Scanner;
public class Matrix_multiplication
{
	public static void main(String[] args)
	{
		int m1,n1,m2,n2,i,j,k;
		int [][]c = new int[50][50];
		System.out.println("Enter order of 1st matrix : ");
		Scanner e=new Scanner(System.in);
		Scanner f=new Scanner(System.in);
		m1 = e.nextInt();
		m2 = f.nextInt();
		int a[][] = new int[m1][m1];
		System.out.println("Enter order of 2nd matrix : ");
		Scanner g=new Scanner(System.in);
		Scanner h=new Scanner(System.in);
		n1 = g.nextInt();
		n2 = h.nextInt();
		int b[][] = new int[n1][n1];
		if(m1 != n2)
		{
			System.out.print("Multiplication not possible");
		}
		if(m1 == n2)
		{
			System.out.println("Enter the elements of first matrix : ");
			for(i=0;i<m1;i++)
			{
				for(j=0;j<m2;j++)
				{
					Scanner s = new Scanner(System.in);
					a[i][j] = s.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix : ");
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n2;j++)
				{
					Scanner p = new Scanner(System.in);
					b[i][j] = p.nextInt();
				}
			}	
			for(i=0;i<m1;i++)
			{
				for(j=0;j<n2;j++)
				{
					c[i][j] = 0;
					for(k=0;k<n1;k++)
					{
						c[i][j] = c[i][j]+a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("Product is : ");
			for(i=0;i<m1;i++)
			{
				System.out.print("\n");
				for(j=0;j<m2;j++)
				{
					System.out.println(“\t”+c[i][j]);
				}
			}
		}
	}
}