package assignments;

interface First{
	static void disp1(){
		System.out.println("in disp1");
	}
}

class Base{
	static void disp2() {
		System.out.println("in disp2");
	}
}

class Sub extends Base implements First{
	static void disp3() {
		First.disp1();
		System.out.println("in disp3.");
	}
	
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First.disp1();
		Base.disp2();
		Sub.disp2();
		Sub.disp3();
	}

}
