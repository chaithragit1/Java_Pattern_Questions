/*WAJP for following pattern
 
 
 -  *  *  *  *  *  *  *  *  * 
 -  -  *  *  *  *  *  *  * 
 -  -  -  *  *  *  *  * 
 -  -  -  -  *  *  * 
 -  -  -  -  -  * 
 
 
  
 */



package JavaPattern;

public class Pattern12 {

	public static void main(String[] args) {
		
		/*FOR LOOP
		
	
		 
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i;k++)
		{
			System.out.print("-"+" ");
		}
			for(int j=1;j<=11-(2*i);j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}


	}

}

		*/
		
	/* USING WHILE LOOP
	 
	 
	 
	 
		int i1=1;
		while(i1<=5)
		{
			int k=1;
			while(k<=i1)
			{
				System.out.print("-"+" ");
				k++;	
			}
			int j=1;
			while(j<=11-(2*i1))
			{
				System.out.print("*" +" ");
				j++;
			}
			i1++;
			System.out.println();
			}
		}
		}
		
		*/
		
		//USING DO WHILE
		
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
	
		