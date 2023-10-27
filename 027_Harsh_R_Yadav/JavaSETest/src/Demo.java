interface Fifth
{
	int Add(int a,int b);
}
class Math1
{
	int calc(int a,int b)
	{
		return a+b;
	}
}
public class Demo
{
	public static void main(String[] args) {
		
	Math1 M1=new Math1();
	Fifth f1=(a,b)->{  return M1.calc(a,b);};
	Fifth f2=M1::calc;
	System.out.println(f1.Add(10,20));
	System.out.println(f2.Add(30,40));
	}
}