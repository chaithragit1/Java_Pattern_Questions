/*
writ a pattern program for the following pattern

-----*
----* *
---*   *
--*     *
-*********

 */

 
 
package JavaPattern;

public class Pattern15 {

	public static void main(String[] args) {

/*for loop
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print("-");//printing space (A1)
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(i==1||i==5||j==1||j==2*i-1)
				{
					System.out.print("*");//printing *(A2)
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();//courser will go to nextline(A3)
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
			while(j<=2*i-1)
			{
				if(i==1||i==5||j==1||j==2*i-1)
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
		
		*/
		
		int i=1;
		do{
			int k=1;
		do	{
				System.out.print("-");
				k++;
			}	while(k<=5-i+1);
			int j=1;
			do{
				if(i==1||i==5||j==1||j==2*i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				j++;
			
			}while(j<=2*i-1);
			i++;
			System.out.println();
		}while(i<=5);
}
}