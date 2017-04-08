import java.io.*;
import java.util.Scanner;
class Studentdetails
{
public String name[][]=new String[10][10];
void getDetails(int n)
{
Scanner get=new Scanner(System.in);
int limit=n;
System.out.println("enter "+limit+"student details\n");
for(int i=0;i<limit;i++)
{
System.out.println("enter student"+(i+1)+"name,roll no & marks");
for(int j=0;j<3;j++)
{
name[i][j]=get.nextLine();
}
}
display(limit);
}




void display(int limit)
{
System.out.println("student name"+"\t"+"roll"+"\t\t"+"marks");
for(i=0;i<limit;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(name[i][j]+"\t\t");
}
System.out.println();
}
}
class Collegeoffice
{
public static void main(String args[])throws IOException
{
Scanner in=new Scanner(System.in);
System.out.print("enter number of students:");
int n=in.nextInt();
studentDetails std=new studentDetails();
std.getDetails(n);
PrintStream output=new PrintStream(new File("studentDetails.txt"));
output.println("student name"+"\t"+"roll"+"\t\t"+"marks");
output.println("---------");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
out.print(std.name[i][j]+"\t\t");
}
output.println();
output.println("----------");
}
output.close();
}
}