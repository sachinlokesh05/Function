package desktop;

import java.util.Scanner;

public class Gambler {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the stack amount");
	int stack=sc.nextInt();
	System.out.println("enter the goal amout");
	double goal=sc.nextDouble();
	System.out.println("enter the number of time do you want you play");
	int no_of_time=sc.nextInt();
	
	int bet=0;
	int wins=0;
	for(int i=1;i<=no_of_time;i++)
	{
		int cash=stack;
		while(cash>0 && cash<goal)
		{
			bet++;
		//	System.out.println(Math.random());
			if(Math.random()<0.5)
			{
				cash++;
			}
			else {
				cash--;
			}
		}
	
		if(cash==goal)
			{
			wins++;
			}
		
	}
	System.out.println();
	System.out.println(wins+" wins in "+no_of_time);
	System.out.println();
	System.out.println(no_of_time-wins+" losses in "+no_of_time);
	System.out.println("percentage of wins "+100.0*wins/no_of_time+" %");
	System.out.println();
	System.out.println("average # bets "+
	1.0 * bet/no_of_time);
sc.close();
}
}
