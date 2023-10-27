package assignments;
interface First{
	int add(int a, int b);
}

class Math1{
	int calc(int a, int b) {
		return a+b;
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m1 = new Math1();
		
		First ref = (a, b)-> {return m1.calc(a, b);};
		
		System.out.println(ref.add(10, 20));
		
		First ref1 = m1::calc;
		System.out.println(ref.add(20, 30));
		
	}

}
