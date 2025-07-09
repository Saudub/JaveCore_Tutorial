package javecore_Concept.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Name = {"Jon","Bon","Ton","Flon"};
		ArrayList<String> ExtendedName = new ArrayList<String>(Arrays.asList(Name));
		ArrayList<String> a = new ArrayList<String>();
		a.add("Saurabh");
		a.add("Sonam");
		a.add("Bulbul");
		a.add("Siddhant");
		
		
		for(String names : a) {
			System.out.println(names);
		}
		System.out.println();
a.remove(0);

for(String recheck :a) {
	System.out.println(recheck);
}

a.add(0, "Saurabh");
System.out.println(a);


a.add("fon");
ExtendedName.add("gone");
System.out.println(a);
System.out.println(ExtendedName);

	}

}
