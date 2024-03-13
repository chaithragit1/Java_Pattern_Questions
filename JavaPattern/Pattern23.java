package JavaPattern;

public class Pattern23 {

	public static void main(String[] args) {
		int n=4, Ecount=2,Ocount=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=4;j++)
				
			if(i==1||i==2)
			{
				if(Ecount<=9)
				{
					System.out.print("0"+Ecount+" ");	
				
		    	}
				else 
				{
					System.out.print(Ecount+" ");	
					
				}
				Ecount+=2;	     
			}
			else if(i==3||i==4)
			{
				if(Ocount<=9)
				{
					System.out.print("0"+Ocount+" ");	
				
		    	}
				else 
				{
					System.out.print(Ocount+" ");	
					
				}
				Ocount+=2;	
			}
			
			
			
			
			System.out.println();
		}
		


	}
}

