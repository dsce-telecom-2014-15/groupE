import java.util.Scanner;
public class Mergearr
{
public static  void main(String args[])
{
int size1,size2,size,i,j,k;
int arr1[]=new int[50];	// Array size is read from console. Why is it hardcoded to 50 here?
int arr2[]=new int[50];
int merge[]=new int[100];
Scanner scan=new Scanner (System.in);
System.out.print("entrt array 1 size:  ");
size1=scan.nextInt();
System.out.print("enter array elements: ");
for(i=0; i<size1; i++)
{
arr1[i]=scan.nextInt();
}
System.out.print("enter array 2 size: ");
size2=scan.nextInt();
System.out.print("enter array elements: ");
for(i=0;i<size2;i++)
{
arr2[i]=scan.nextInt();
}

System.out.print("merge\n");
for(i=0;i<size1;i++)
{
merge[i]=arr1[i];
}
size=size1+size2;
for(i=0; i<size2;i++)
{
merge[k]=arr2[i];
}
System.out.print("new array is\n");
for(i=0;i<size;i++)
{
System.out.print(merge[i]+" ");
}
}
}