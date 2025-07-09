package javecore_Concept.com;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object  //String literal
		String s = "Saurabh Dubey Learning";
		String s1= "Saurabh Dubey Learning";
		String s3= "Welcome";
		
		//new  -new object is created in memory
		String S1 = new String("Welcome");
		String S2 = new String("Welcome");
		
		String[] splitString = s.split(" ");
		
		for(String i :splitString) {
			System.out.println(i);
		}

		//Functions are split,trim charAt(index)
	}

}
