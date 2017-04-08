class Prgm1a
{
public static void main(String []args)
{
int rev =0;
int rem=0;
int num=1234;
{
while (num>0)
 rem=num%10;
rev =rev*10+rem;
num=num/10;
}
System.out.println("reversed number="+rev);
}
}