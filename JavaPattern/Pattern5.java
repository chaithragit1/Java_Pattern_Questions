package JavaPattern;

public class Pattern5 {

	public static void main(String[] args) {
	/*using for loop
	 	for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
*/
		/*using while
			int i=1;
			while(i<=5)
			{
				
		        int j=1;
				while(j<=i)
				{
					System.out.print("*");
					
					j++;
				}
					System.out.println();
					i++;
			}
	}
}
		*/
		
		int i=1;
		do {
			int j=1;
			do {
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
			}while(i<=5);
		}
}