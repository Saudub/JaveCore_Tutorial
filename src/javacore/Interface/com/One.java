package javacore.Interface.com;

public class One implements Interface_Demo,Interface_Demo2{
	int a=9,b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_Demo id =new One();
		Interface_Demo2 id1 = new One();
		One id2 = new One();
		id2.sum();
		id.greencolor();
		id.flashyYellow();
		id.redcolor();
		id1.FourWheeler();
		id1.ThreeWheeler();
		id1.TwoWheeler();

	}

	@Override
	public void greencolor() {
		// TODO Auto-generated method stub
		System.out.println("Green Color");
		
	}

	@Override
	public void redcolor() {
		// TODO Auto-generated method stub
		System.out.println("Red Color");
		
	}

	@Override
	public void flashyYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashy Color");
		
	}

	@Override
	public void TwoWheeler() {
		// TODO Auto-generated method stub
		System.out.println("Two Wheeler");
		
	}

	@Override
	public void ThreeWheeler() {
		// TODO Auto-generated method stub
		System.out.println("Three Wheeler");
		
	}

	@Override
	public void FourWheeler() {
		// TODO Auto-generated method stub
		System.out.println("Four Wheeler");
		
		
	}
	
	public void sum() {
		int c= a+b;
		System.out.println(c);
	}

}
