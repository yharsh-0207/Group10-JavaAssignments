//package assignments;
//
//
//
//interface Fourth{
//	default void disp3() {
//		System.out.println("In Fourth Disp3.");
//	}
//}
//
//class Base1{
//	public void disp3() {
//		System.out.println("In Base1 Disp3.");
//	}
//}
//
//class Sub1 extends Base1 implements Fourth{
//	public void myFun() {
//		Fourth.super.disp3();
//		System.out.println("In Sub1 Fun.");
//	}
//}
//
//public class Q2 {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Sub1 s1 = new Sub1();
//		s1.myFun();
//		s1.disp3();
//		}
//
//}
