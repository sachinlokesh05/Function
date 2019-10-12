package desktop;
import java.util.Scanner;
public class Distance {
	
static void Euclidean_distance(double x,double y)
{
	 
	double distance = Math.sqrt(Math.pow(x, 2) +Math.pow(y, 2));
	 System.out.println("distance from origin(0,0) to "+ "("+x+","+y+")"+"="+distance);
}

public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of x and y");
	double x=sc.nextInt();
	double y=sc.nextInt();
	Euclidean_distance(x, y);
} 
}
