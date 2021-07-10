import java.util.Scanner;
class Problem24
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a Binary Number: ");
	int num=sc.nextInt();
	int rem;
	int count=0;
	int dec=0;
	while(num!=0)
	{
	rem=num%10;
	num/=10;
	dec=dec+rem*(int)Math.pow(2,count++);
	}
	String str="";
	while(dec!=0)
	{
	rem=dec%8;
	dec/=8;
	str=rem+str;
	}
	System.out.println("Octal number: "+str);
}
}