package JavaPattern;

public class Pattern17 {

	public static void main(String[] args) {
		int n=5,k=1;
		 for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==2)
				{
					System.out.print(k+" ");
				}
				else
				{
				System.out.print(k);
				}
			   k=k+1;
			}

			System.out.println();
		}
		

	}

}

