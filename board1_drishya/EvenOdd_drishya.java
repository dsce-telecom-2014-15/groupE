import java.util.Scanner;


public class EvenOdd_drishya {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=Sc.nextInt();
		int ar[]=new int[size];
		System.out.println("enter the value");
		for (int i=0;i<size;i++)
		{
			ar[i]=Sc.nextInt();
		}
		int evensum=0,oddsum=0;
		for(int i=0;i<size;i++){
			if(ar[i]%2==0)
				
			{
				evensum+=ar[i];
			}
			else{
				oddsum+=ar[i];
			}
		}
System.out.println("SUM OF EVEN = "+evensum);
System.out.println("SUM OF ODD 3= "+oddsum);


	}

	private static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
