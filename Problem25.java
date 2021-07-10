import java.util.Scanner;
class Problem25
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a Binary Number: ");
	int num=sc.nextInt();
	int rem;
	int oct=0;
	int count=0;
	while(num!=0)
	{
	rem=num%10;
	num/=10;
	oct=oct+rem*(int)Math.pow(8,count++);    //8^0*rem+8^1*rem+8^2*rem+8^3*rem
	}
	System.out.println("Equivalent decimal number: "+oct);
}
}