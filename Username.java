import java.util.Scanner;
public class Username {
public String username;

public Username(String i) {
	super();
	this.username = i;
}
void print()
{
	System.out.println("Hello "+username+",How are you?");
}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user name");
	Username u=new Username(sc.next());
	u.print();
	
	}
}
