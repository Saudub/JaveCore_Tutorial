package javecore_Concept.com;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Saurabh Dubey";
		String[] SplitName = Name.split(" ");
		List<String> ListName = Arrays.asList(SplitName);
		System.out.println(ListName);
		System.out.println(ListName.contains("Saurabh"));
		System.out.println(SplitName[0]);
		char[] CharName = Name.toCharArray();
		System.out.println(CharName);
		for (int i = CharName.length - 1; i >= 0; i--) {
			System.out.print(CharName[i]);
		}
		

}
}
