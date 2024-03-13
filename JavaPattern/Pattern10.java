/*write a pattern program for
 
 
 -  -  -  -  -  * 
 -  -  -  -  *  * 
 -  -  -  *  *  * 
 -  -  *  *  *  * 
 -  *  *  *  *  * 

 
 
 
 */


package JavaPattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		/*USING FOR LOOP
		 
		 
		 
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
		{
			System.out.print(" - ");
		}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}

*/
		
		/*using while loop
		
	int i=1;
	while(i<=5)
	{
		int k=1;
		while(k<=5-i+1)
		{
			System.out.print("-");
			k++;
		}
		int j=1;
		while(j<=i)
		{
			System.out.print("*");
			j++;
			
		}
		i++;
		System.out.println();
		
	}
	}
}
		*/
		
		
	//using do while	
		
		int i=1;
		do{
			int k=1;	
			do{
				System.out.print("-"+" ");
				k++;
			}while(k<=5-i+1);
			int j=1;
			do{
				System.out.print("*"+" ");
				j++;
				
			}while(j<=i);
			i++;
			System.out.println();
			
		}while(i<=5);
		}
	}
		
		