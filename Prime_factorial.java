package desktop;

import java.util.Scanner;

public class Prime_factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
	for(int i=2;i<=n;i++)
	{
			while(n%i==0)
			{
				System.out.println(i+" ");
				n=n/i;
			}
				
	}
	sc.close();
}
}
