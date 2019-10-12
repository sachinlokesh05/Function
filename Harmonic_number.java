import java.util.Scanner;
public class Harmonic_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth number");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			
			sum=sum+(float)1/i;
			System.out.println("1/"+i+":"+sum);
		}
		System.out.println();
		System.out.println("nth harmonic value:"+sum);
		}

	}


