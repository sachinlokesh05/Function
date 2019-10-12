package desktop;

import java.util.Scanner;

public class Flipcoin {
	public static void main(String[] args) {
		int heads=0;
		int tails=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of time coin to be tossed");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(Math.random()<0.5)
		{
			heads++;
		}else
		{
			tails++;
		}
		}
		System.out.println("heads: "+heads);
		System.out.println("tails: "+tails);
		sc.close();
	}
	}


