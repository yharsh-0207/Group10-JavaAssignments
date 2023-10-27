//package assignments;
//
//interface First{
//	default void fun() {
//		System.out.println("In First Fun.");
//	}
//}
//
//interface Second{
//	default void fun() {
//		System.out.println("In Second Fun.");
//	}
//}
//
//interface Third{
//	default void disp1() {
//		System.out.println("In Disp1.");
//	}
//	
//	static void disp2() {
//		System.out.println("In Disp2.");
//	}
//}
//
//class Sub implements Third{
//	void disp2() {
//		Third.disp2();
//		System.out.println("In sub disp2");
//	}
//}
//class Child implements First, Second{
//	public void fun() {
//		System.out.println("In Child Fun.");
//	}
//}
//
//public class Q1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Child ch = new Child();
//		ch.fun();
//		Sub s = new Sub();
//		s.disp1();
//		s.disp2();
//	}
//
//}
