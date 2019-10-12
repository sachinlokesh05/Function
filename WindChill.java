package desktop;

import java.util.Scanner;

public class WindChill {
	
static double wind_chill(double t,double v)
{
	double temperature = 0;
	if(Math.abs(t)>50 || (v>120 || v<3))
	{
		System.out.println("it is not an valid input");
	}else {
	double pow=Math.pow(v, 0.6);
	temperature=35.74+((0.6215*t)+((0.4275*t)-35.75)*pow);
}return temperature;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the absolute temperature(t) and wind speed(v):");
    double t=sc.nextDouble();
    double v=sc.nextDouble();
   System.out.println("effective temperature (the wind chill) is="+wind_chill(t, v));
sc.close();
}
}
