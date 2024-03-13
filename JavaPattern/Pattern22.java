package JavaPattern;

public class Pattern22 {

	public static void main(String[] args) {
		int n=5;int count=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				if(count<=9)
				{
					
				System.out.print("0"+count+" ");
				}
				else
				{
					System.out.print(count+" ");
					
				}
			   count+=1;
			}

			System.out.println();
		}
		

	}


	}


