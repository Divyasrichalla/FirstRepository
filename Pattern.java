class Pattern
{
	public static void main(String x[])
	{
		int i,j;
		for(i=0;i<=4;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" *");
			}
			System.out.println(" *");
		}
		for(i=0;i<=4;i++)
		{
			for(j=4;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println(" *");
		}
		
	}	
}