class Problem14
{
public static void main(String args[])
{
	for(int row=1;row<=15;row++)
	{
	if(row<9)
		{
			if(row%2==0)
			System.out.println(" * * * * *  ==================================");
			else
			System.out.println("* * * * * * ==================================");
			
		}
		else
		System.out.println("==============================================");		
	}
}
}