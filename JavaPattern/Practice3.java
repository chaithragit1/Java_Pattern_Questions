package JavaPattern;

public class Practice3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
		{
			System.out.print("-");
		}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||j==2*i-1)
		     	{
				System.out.print("*");
			    }
		else	
		      {
			System.out.print(" ");
		      }
		}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
		     {
			System.out.print("-");
		      }
			for(int j=1;j<=11-(2*i);j++)
			{
				if(j==11-(2*i)||j==1)
				{
				System.out.print("*");
			    }
				else
				{
					System.out.print(" ");
				}
			
		    }
			System.out.println();

	}

	}

}
