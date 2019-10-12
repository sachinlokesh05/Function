package desktop;

import java.util.Scanner;

public class Quadratic {
static void quadratic(double a,double b,double c)
{
	double delta =(b*b - 4*a*c);
	if(delta<0) {
		System.out.println("The output is imaginary(negative)");
	}else {
		double x1= ((-b + Math.sqrt(delta))/(2*a));
		double x2=((-b - Math.sqrt(delta))/(2*a));
	System.out.println("x1="+x1);
	System.out.println("x2="+x2);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a,b,c values");
	double a=sc.nextDouble();//a should not be 0; equation will be linear
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	quadratic(a, b, c);
	sc.close();
}
}


