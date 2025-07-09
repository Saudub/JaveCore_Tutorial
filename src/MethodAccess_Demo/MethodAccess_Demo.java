package MethodAccess_Demo;

public class MethodAccess_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

				MethodAccess_Demo md = new MethodAccess_Demo();
				md.sum();

				int c = subtraction();
				System.out.println(c);
				
				MethodAccess_Demo1 md1 = new MethodAccess_Demo1();
				md1.Multiplication();
			int num = MethodAccess_Demo1.division();// we can call through the class name as well.
			System.out.println(num);
			String MyName = md1.Printname();
			System.out.println();
				

			}

			public void sum() {

				int a = 5 + 6;
				System.out.println(a);
			}

			public static int subtraction() {

				int b = 10 - 4;
				return b;


	}

}
