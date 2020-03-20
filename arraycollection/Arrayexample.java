package arraycollection;

import java.util.Scanner;

public class Arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix;
		matrix = new int[3][3];
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the value of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=scn.nextInt();
			}
		}
		
		System.out.println(" values of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(matrix[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int[] num1;
		num1=new int[5];
		num1[0]=10; num1[1]=20; num1[2]=30; num1[3]=40; num1[4]=50;
		for(int i:num1)
		{
			System.out.println(i);
		}
		
		int[] num2 = {100,200,300,400,500};
		
		String[] names = {"radha","ranjitha","uppu"};
		for(String i:names)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<num2.length;i++)
		{
			System.out.println(num2[i]);
		}
*/
	}

}
