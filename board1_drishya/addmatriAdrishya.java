package board1_drishya;
import java.util.Scanner;
public class addmatriAdrishya {

	public static void main(String[] args) {
		
                int i,j;
				int mat1[][]=new int[3][3];
				int mat2[][]=new int[3][3];
				int mat3[][]=new int[3][3];
				Scanner scan =new Scanner(System.in);
				System.out.print("enter matrix 1 element");
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						mat1[i][j]=scan.nextInt();
					}
				}
				System.out.print("enter matrix 2 element");
				for(i=0;i<3;i++)
				{
					for(j=0;j<3;j++)
					{
						mat2[i][j]=scan.nextInt();
					}
				}
		System.out.println("adding both matrix......");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
				}
		}
		System.out.println("the 2 matrix added succesfully......");
		System.out.println("the new matrix will b.....");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
			}

		


	}


