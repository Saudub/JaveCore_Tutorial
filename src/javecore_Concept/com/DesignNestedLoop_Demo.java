package javecore_Concept.com;

public class DesignNestedLoop_Demo {
	int i,j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesignNestedLoop_Demo d = new DesignNestedLoop_Demo();
		d.RightAngleTriangle();
		d.downRightAngleTriangle();
	}

	
	public void RightAngleTriangle() {
		
	
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void downRightAngleTriangle() {
		
		for(i=0;i<=5;i++) {
			
			for(j=i;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
}
}
