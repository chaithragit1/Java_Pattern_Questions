/*
WAJP

-  -  -  -  -  * 
 -  -  -  -  *  *  * 
 -  -  -  *  *  *  *  * 
 -  -  *  *  *  *  *  *  * 
 -  *  *  *  *  *  *  *  *  * 
 -  -  *  *  *  *  *  *  * 
 -  -  -  *  *  *  *  * 
 -  -  -  -  *  *  * 
 -  -  -  -  -  * 


*/


package JavaPattern;

public class Pattern13 {

	public static void main(String[] args) {
		
		/*for loop
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=5-i+1;k++)
		{
			System.out.print(" - ");
		}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
		{
			System.out.print(" - ");
		}
			for(int j=1;j<=11-(2*i);j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}


	}

}
*/
	//	using while loop
	/*	
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=5-i+1)
			{
				System.out.print("-");
				k++;	
			}
			int j=1;
			while(j<=2*i-1)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	
		int i1=1;
		while(i1<=5)
		{
			int k=1;
			while(k<=i1)
			{
				System.out.print("-");
				k++;	
			}
			int j=1;
			while(j<=11-(2*i1))
			{
				System.out.print("*");
				j++;
			}
			i1++;
			System.out.println();
			}
		}
		}
	*/
		
		//using do while
		
		
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("-");
				k++;	
			}while(k<=5-i+1);
			int j=1;
		do
			{
				System.out.print("*");
				j++;
			}	while(j<=2*i-1);
			i++;
			System.out.println();
		}while(i<=4);
	
		int i1=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("-");
				k++;	
			}while(k<=i1);
			int j=1;
			do
			{
				System.out.print("*");
				j++;
			}while(j<=11-(2*i1));
			i1++;
			System.out.println();
			}while(i1<=5);
		}
		}
	
		