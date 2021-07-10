import java.util.Scanner;
class Problem12
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number");
	float a=sc.nextFloat();
	System.out.println("enter second number");
	float b=sc.nextFloat();
	System.out.println("enter second number");
	float c=sc.nextFloat();
	float avg=((a+b+c)/3);
	System.out.println(avg);
}
}