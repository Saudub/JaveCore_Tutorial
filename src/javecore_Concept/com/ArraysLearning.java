package javecore_Concept.com;

public class ArraysLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		int[] RandomNum = {1,5,4,8,6,10};
		String[] names = {"Saurabh","Sonam","Bulbul","Siddhant"};
		arr[0]=1;
		arr[1]=5;
		arr[2]=8;
		arr[3]=10;
		arr[4]=15;
		//arr[5]=20;   java.lang.ArrayIndexOutOfBoundsException:

	for(int i=0;i<5;i++) {
		
		System.out.println(arr[i]);
	}
	
	//(inhanced for loop)
	for(String n :names) {
		System.out.println(n);
	}
	
	for(int i : RandomNum) {
		
		if(i%2==0) {
			System.out.println(i);
		}
		else
			System.out.println(i + " is not Divisible by 2");
	}
}
}