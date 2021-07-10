import java.util.Scanner;
class Problem22
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a binary number:");
	int num=sc.nextInt();
	int rem;
	int temp=0;
	int count=0;
	while(num!=0)
	{
	rem=num%10;
	num/=10;
	temp=temp+rem*(int)Math.pow(2,count++);
	}
	System.out.println("Decimal Number: "+temp);
}
}