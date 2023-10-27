import java.util.Scanner;

class MyArithException extends Exception
{
	public MyArithException (String mess)
	{
	 super (mess);
	}
}
class Calculator
{
	 static int calDouble(int k) throws MyArithException 
	{
		 if(k==0)
		 {
			 throw new MyArithException("Zero Not Allwed");
		 }
		 if(k<0) 
		 {
			 throw new MyArithException("negative not allowed");
		 }
		 
		return k+k;
	}
}
public class MyCalcApp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		try
		{
			int k=Calculator.calDouble(a);
			System.out.println(k);
		}
		catch(MyArithException m)
		{
			System.out.println(m);
		}
	
		System.out.println("Done");
	}
}