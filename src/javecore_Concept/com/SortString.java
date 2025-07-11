package javecore_Concept.com;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortString s = new SortString();
		char[] newname= s.SortName();
		System.out.println(newname);

	}

	public char[] SortName() {
		
		String Name = "Saurabh Dubey";
String NoSpaceName =Name.replaceAll("\\s","");
String LowerCaseName  = NoSpaceName.toLowerCase();
System.out.println(LowerCaseName);
char[] charname = LowerCaseName.toCharArray();
Arrays.sort(charname);
return(charname);
	}
}
