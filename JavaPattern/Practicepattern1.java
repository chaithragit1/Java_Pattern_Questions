package JavaPattern;

public class Practicepattern1 {

	public static void main(String[] args) {
          int n=5;
          char ch='A';
          
          /*
          for(int i=1;i<=n;i++)
          {
        	  for(int k=1;k<=n-i+1;k++)
        	  {
        		  System.out.print("-"+" ");
        	  }
        	  for(int j=1;j<=2*i-1;j++)
        	  {
        		  System.out.print(ch+" ");
        		  
        	  }
        	  System.out.println();
        	 // ch++;
          }
          
	}

}
*/
          for(int i=1;i<=n;i++)
          {
        	  ch='A';
        	  for(int j=1;j<=i;j++)
        	  {
        		  System.out.print(ch+" ");
        		  ch++;
        	  }
        	  System.out.println();
          }
	}
}