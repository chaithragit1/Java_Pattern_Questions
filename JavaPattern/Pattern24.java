package Javapattern;

public class Pattern24 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print(" "+" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1)
				System.out.print("1"+ " ");
				else if(j==3)
				{
					System.out.print(i-1+" ");
				}
				else if(j==5)
				{
					if(i==3)
						System.out.print(i-2+" ");
					if(i==4)
						   System.out.print(i-1+" ");
					  if(i==5)
						  System.out.print(i+1+" ");
				}
				else if(j==7)
				{
				 if(i==4)
					System.out.print(1+" ");
				 else
				   System.out.print(i-1+" ");

				}
				else if(j==9)
				{
				    
					System.out.print(i-4+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
