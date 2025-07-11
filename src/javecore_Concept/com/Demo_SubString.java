package javecore_Concept.com;

public class Demo_SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String FirstName ="Saurabh";
		String LastName ="Dubey";
		int FirstNameLength =FirstName.length();
		
		FirstName =FirstName+LastName;
		LastName =FirstName.substring(0, FirstNameLength);
		FirstName=FirstName.substring(FirstNameLength);
		
		System.out.println("FirstName is "+ FirstName+" And "+" LastName is "+LastName);
		
	

	}

}
