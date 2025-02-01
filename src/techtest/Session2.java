package techtest;

public class Session2 
{
	public static void main(String[] args)
	{
		int [] a = {4,6,2,34,12,23};
		
		int max = a[0];
		
		for(int a1 : a)
		{
			if(a1>max)
				
			{
				max = a1;
				
			}
				
		}
		
		System.out.println(max);
		
	}
	

}
