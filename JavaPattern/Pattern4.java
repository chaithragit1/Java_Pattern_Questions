package JavaPattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	     System.out.println("enter the what you want to print");
	     char ch=sc.next().charAt(0);
	     
	 
	     /*for loop
	      for(int i=1;i<=5;i++)//no of rows
	      
	     {
	    	 for(int j=1;j<=10;j++)// j is for no of char
	    	 {
	    		 System.out.print(ch);
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
	    	
	        int j=1;
			while(j<=10) {
	    	 System.out.print(ch);
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
			System.out.print(ch);
			j++;
		}while(j<=10);
		System.out.println();
		i++;
		}while(i<=5);
		
		
	}
	}



