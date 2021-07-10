import java.util.Scanner;
class Problem19
{
public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.print("Input a Decimal Number :");
	int num=sc.nextInt();
	int rem;
	String a="";
	while(num!=0)
	{          
	rem=num%2; //rem=1 rem=0 rem=1
 	num=num/2; //num=2 num=1 num=0
	a=rem+a;
	}
System.out.println("Binary number is: "+a);
}
}