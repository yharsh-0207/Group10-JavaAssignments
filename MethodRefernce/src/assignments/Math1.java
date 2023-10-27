//package assignments;
//
//interface fifth{
//	int add(int a, int b);
//}
//public class Math1 {
//
//	int calc(int a, int b) {
//		return a+b;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//		 fifth ref1 = (a, b) -> {return new Math1().calc(a,b);};
//		 System.out.println(ref1.add(10, 10));
//		 
//		 fifth ref2 = new Math1()::calc;
//		 System.out.println(ref2.add(20, 50)); //complier will write: fifth ref1 = (a, b) -> {return new Math1().calc(a,b);};
//	}
//
//}
