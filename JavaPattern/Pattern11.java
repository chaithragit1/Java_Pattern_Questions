/*write a program for following pattern
 
 
 -  -  -  -  -  * 
 -  -  -  -  *  *  * 
 -  -  -  *  *  *  *  * 
 -  -  *  *  *  *  *  *  * 
 -  *  *  *  *  *  *  *  *  * 


 
 */


package JavaPattern;

public class Pattern11 {

	public static void main(String[] args) {
		
		
		/*
		 USING FOR LOOP
		 
		 
		for(int i=1;i<=5;i++)
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

	}
}

*/
		
		/*USING WHILE LOOP
		 
		 
		 
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
		
	*/	
		
		
	//*USING DO WHILE
	 	
	 
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("-"+" ");
				k++;	
			}while(k<=5-i+1);
			int j=1;
		do
			{
				System.out.print("*"+" ");
				j++;
			}	while(j<=2*i-1);
			i++;
			System.out.println();
		}while(i<=4);
	}
}

		
		
		
		