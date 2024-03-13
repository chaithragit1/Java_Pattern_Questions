package JavaPattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a n value");
		int n=sc.nextInt();
		System.out.println("enter a user input what has to be printed");
		char ch=sc.next().charAt(0);
/*		 
	//using for loop	 
	for(int i=1;i<=n;i++)
		{
			System.out.println(ch);
		}

	}

}*/
/*using while
int i=1;
while(i<=n)
{
	System.out.println(ch);
	i++;
}
}
}*/
	int i=1;
	do {
		System.out.println(ch);
		i++;
	}while(i<=n);
}
	
}
		