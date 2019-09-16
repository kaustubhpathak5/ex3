package ex4;

public class Prime 
{
	public static void main(String[] args) 
	{
	System.out.println("The prime numbers are");
	int num=100;
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;	
		}
		
	}
	if(count==2)
	{
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not Prime");
	}
	}
	}


