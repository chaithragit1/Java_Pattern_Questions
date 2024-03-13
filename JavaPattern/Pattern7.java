package JavaPattern;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
/*using for loop	
		
		for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print( "-");
		}
	
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
				
			}
System.out.println();
	}

}
}
*/
/*	using for loop	METHOD2
		
		for(int i=1;i<=n;i++)
	{
		for(int K=1;K<=n;K++)
		{
			System.out.print( "-");
		}
	
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
				
			}
System.out.println();
	}

}	
}*/
		
/*using while loop		
	int i=1;
	while(i<=n) {
		int k=1;
		{
			while(k<=n)
			{
				System.out.print("-");
				k++;
			}
			int j=1;
			{
				while(j<=n)
				{
					System.out.print("*");
					j++;
				}
			}
			i++;
			System.out.println();
		}
		
	}
	}
}*/

	int i=1;
	do {
		int k=1;
		do {
			System.out.print(" - ");
			k++;
		}while(k<=n);
		int j=1;
		do {
			System.out.print(" * ");
			j++;
		}while(j<=n);
		i++;
		System.out.println();
	}while(i<=n);
	
	
	
	
	}
}	
