package desktop;

import java.util.Scanner;

public class Stop_watch {
	double start_time;
	double stop_time;
	double elapsed_time;
void start()
{
	start_time=System.currentTimeMillis();
	System.out.println("the starting time is="+start_time);
}

void stop()
{
	stop_time=System.currentTimeMillis();
	System.out.println("the stopped time is="+stop_time);
}

double Elapsed_time()
{
	elapsed_time=stop_time-start_time;
	return elapsed_time;
}


public static void main(String[] args) {
	Stop_watch sw=new Stop_watch();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1 to start");
	int x=sc.nextInt();
	sw.start();
	System.out.println();
	System.out.println("enter the 0 to stop");
	int y=sc.nextInt();
	sw.stop();
	System.out.println();
		
	System.out.println("total elapsed time is "+sw.Elapsed_time()+" milli sec");
	System.out.println();
	System.out.println("total elapsed time is "+sw.Elapsed_time()/1000+" sec");
}
}
