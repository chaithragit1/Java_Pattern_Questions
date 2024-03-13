package JavaPattern;

public class Pattern24 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
				for(int k=1;k<=5-i+1;k++)
			{
				System.out.print("-");
			}
				
				for(int j=1;j<=2*i-1;j++)
				{
				if(j==1||j==5)
				{
					System.out.println(1);
				}
				else
				{
					System.out.println(i);
				}
				for(int k=1;k<=i;k++)
				{
					if(k==0||k==1||k==2||k==3||k==4)
					{
					System.out.print("$");
					}
					
				}
		
		
}
		}
		
		
	}
}
		



