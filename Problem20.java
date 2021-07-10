import java.util.Scanner;
class Problem20
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a decimal number: ");
	int num=sc.nextInt();
	int rem;
	String str="";
	char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	while(num!=0)
	{
	rem=num%16;
	num/=16;
	str=a[rem]+str;
	}
	System.out.println("Hexadecimal number is : "+str);
}
}
