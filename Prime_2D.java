package desktop;

public class Prime_2D {
static boolean isPrime(int i)
{
	if(i==0||i==1)
	{
		 return false;
	}
	
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		return false;
	}
	return true;
}
public static void main(String[] args) {
	int m=100;
	int [] arr=new int[m];
	for(int i=0;i<100;i++)
	{
	isPrime(i);
	for(int m1=0;m1<100;m1++)
	{
		if(isPrime(i))
		arr[m1]=i;
	}
	for(int j=0;j<=arr.length;j++)
	{
		System.out.println(arr[j]);
	}
	
}
}
}
