package desktop;

import java.util.Scanner;

public class Sumoftri {
int sumoftriplets(int[] b,int size)
{
	int count=0;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			for(int k=j+1;k<size;k++)
			{
				if(b[i]+b[j]+b[k]==0)
				{
					System.out.println(b[i]+" "+b[j]+" "+b[k]);
					count++;
				}
			}
		}
	}
	return count;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of arr");
	int size=sc.nextInt();
	int []arr=new int[size];
	System.out.println();
	System.out.println("enter the values");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	Sumoftri sr=new Sumoftri();
	int m=sr.sumoftriplets(arr, size);
	System.out.println("no of triplets: "+m);
	sc.close();
}
}
