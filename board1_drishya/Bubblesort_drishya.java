package board1_drishya;

public class Bubblesort_drishya {

	public static void main(String[] args) 
		
		{
		int numbers[]={1,2,17,0,44,8,4};
		System.out.print("before:");
		for(int i=0;i<numbers.length;i++)
		{ 
		System.out.print(numbers[i]+" ");
		}
		System.out.println();
		Bubblesortasc(numbers);
		System.out.print("after"+" ");
		for (int i=0;i<numbers.length;i++)
		{
		System.out.print(numbers[i]+" ");
		}
		}public static void Bubblesortasc(int numbers[])
		{
		int temp;
		for (int i=0;i<numbers.length;i++)
		{
		for(int j=1;j<(numbers.length-i);j++)
		{
		if(numbers[j-1]>numbers[j])
		{
		temp=numbers[j-1];
		numbers[j-1]=numbers[j];
		numbers[j]=temp;
		}
		}
		}
		

	}

}
