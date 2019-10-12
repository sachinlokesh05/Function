//Date: thursday,10/10/2019 
package desktop;
import java.util.Scanner;

public class Leapyear {
 
	int year;

	public Leapyear(int year) {
		super();
		this.year = year;
	}
	
	void is_it()
	{
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println(year+":it is a leap year");
		}else {
			System.out.println(year+":it is not a leap year");
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		Leapyear y=new Leapyear(sc.nextInt());
		y.is_it();
	}
	

}
