/*WAJP
  
  

 -  -  -  -  -  *  *  *  *  * 
 -  -  -  -  -  *           * 
 -  -  -  -  -  *           * 
 -  -  -  -  -  *           * 
 -  -  -  -  -  *  *  *  *  * 

 
 */

package JavaPattern;

public class Pattern14 {

	public static void main(String[] args) {

/*using for loop
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5;k++)
			{
				System.out.print(" - ");
			}
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
*/
		
		/*	using while
		  
		 
		int i=1;
		while(i<=5)
		{
			int k=1;
				{
		while(k<=5)
					{
				System.out.print("-");
				k++;
			}	
			int j=1;
			while(j<=5)	
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				j++;
			
			}
			i++;
			System.out.println();
		}
}
	}
}
		
	*/	
	
		int i=1;
		do{
			int k=1;
		do	{
				System.out.print("-");
				k++;
			}	while(k<=5);
			int j=1;
			do{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				j++;
			
			}while(j<=5);
			i++;
			System.out.println();
		}while(i<=5);
}
}
		