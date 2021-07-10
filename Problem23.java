import java.util.Scanner;
class Problem23
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a Binary Number: ");
	int num=sc.nextInt();
	int dec=0;
	int rem;
	int count=0;
	while(num!=0)
	{
	rem=num%10;
	num/=10;
	dec=dec+rem*(int)Math.pow(2,count++);   //converted binary int decimal
	
	}
	String str="";
	char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	while(dec!=0)
	{
	rem=dec%16;
	dec/=16;
	str=a[rem]+str;        //converted decimal into hexadecimal
	}
	System.out.println("HexaDecimal value: "+str);
}
}