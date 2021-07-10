import java.util.Scanner;
class Problem18
{
public static void main(String args[])
{
	System.out.print("Input the first binary number: ");
	int num1=sc.nextInt();
	System.out.print("Input the second binary number: ");
	int num2=sc.nextInt();
	int count1=0,count2=0;
	int rem1,rem2;
	int dec1=0,dec2=0;
	while(num1!=0)
	{
	rem1=num1%10;
	num1/=10;
	dec1=dec1+rem1*(int)Math.pow(2,count1++);
	}
	while(num2!=0)
	{
	rem2=num2%10;
	num2/=10;
	dec2=dec2+rem2*(int)Math.pow(2,count2++);
	}
	int num3=dec1*dec2;
	int rem3;
	String a="";
	while(num3!=0)
	{
	rem3=num3%2;
	num3/=2;
	a=rem3+a;
	}
	System.out.println("Product of two binary numbers:"+a);
}
}