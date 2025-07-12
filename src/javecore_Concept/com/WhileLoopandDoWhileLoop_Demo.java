package javecore_Concept.com;

public class WhileLoopandDoWhileLoop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WhileLoopandDoWhileLoop_Demo wd = new WhileLoopandDoWhileLoop_Demo();
		wd.whileloop();
		wd.Dowhileloop();
		
	
	}

	
	public void whileloop() {
		
	int a=4;
		
		while(a>6)
		{
			System.out.println(a);
			a++;
		
	}
}
	
	public void Dowhileloop() {
		
	int a=4;
		
	do {
		System.out.println(a);
		a++;
	}
		while(a>6);
	
}
}
