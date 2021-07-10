import java.util.Scanner;
class Problem21
{
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a Decimal number: ");
	int num=sc.nextInt();
	int oct=0;
	int rem;
	String str="";
	while(num!=0)
	{
	rem=num%8;
	num/=8;
	str=rem+str;
	}
	System.out.println("Octal number is: "+str);
}
}