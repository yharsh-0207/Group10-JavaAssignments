//package assignments;
//
//interface Base1{
//	default void fun1() {
//		System.out.println("In base fun");
//	}
//}
//
//interface sub1 extends Base1{
//	default void fun2() {
//		Base1.super.fun1();
//		System.out.println("In Sub1 fun.");
//	}
//}
//
//class sub2 implements sub1{
//	public void fun3() {
//		sub1.super.fun2();
//		System.out.println("in sub2 fun");
//	}
//}
//public class Q4 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		sub2 s2 = new sub2();
//		s2.fun3();
//	}
//
//}
