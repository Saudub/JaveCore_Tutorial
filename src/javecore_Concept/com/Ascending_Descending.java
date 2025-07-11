package javecore_Concept.com;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Ascending_Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numberlist = {12,18,45,23,56,31,89,43};
		Arrays.sort(numberlist);
		Arrays.sort(numberlist,Collections.reverseOrder());
		
		
		System.out.println(Arrays.toString(numberlist));
		
		

		

	}

}
