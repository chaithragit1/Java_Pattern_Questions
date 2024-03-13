package JavaPattern;

public class Practice2 {

	public static void main(String[] args) {
		/*
	for	(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print("-"+" ");
			}
			for(int j=1;j<=i;j++)
				if(i==5||j==1||j==5||j==i)
				{
				System.out.print("*"+" ");
				
				}
				else
				{
					System.out.print(" "+" ");
				}
			System.out.println();
				}
	}

}
*/
		/*
		for	(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print("-"+" ");
			}
			for(int j=1;j<=2*i-1;j++)
				if(i==5||j==1||j==2*i-1)
				{
				System.out.print("*"+" ");
				
				}
				else
				{
					System.out.print(" "+" ");
				}
			System.out.println();
				}
	}

}
*/
		for	(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("-"+" ");
			}
			for(int j=1;j<=11-2*i;j++)
				if(i==1||j==1||j==11-2*i)
				{
				System.out.print("*"+" ");
				
				}
				else
				{
					System.out.print(" "+" ");
				}
			System.out.println();
				}
	}

}