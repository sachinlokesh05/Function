package desktop;

import java.util.Scanner;

public class CoupanNumber{
	
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of n");
			int n = sc.nextInt();
			boolean[] isCollected = new boolean[n];
			int count =0;
			int distinct =0;
			
			while(distinct<n){
				int value = (int)(Math.random()*n);
				count++;
				System.out.println(value);
				
				if(!isCollected[value]){
					distinct++;
					isCollected[value] = true;
				}
			}
			System.out.println(count);
			sc.close();
			
	}
}