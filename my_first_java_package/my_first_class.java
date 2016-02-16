package my_first_java_package;

import java.util.ArrayList;

public class my_first_class {
	public static void main(String[] args) {
		ArrayList<Integer> listInt = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listInt.add(i);
		}
		System.out.println("Hello world!");
		System.out.println(listInt.toString());
		System.out.println(listInt.add(11));
		System.out.println(listInt.toString());
		System.out.println(listInt.add(11));
		System.out.println(listInt.toString());
		System.out.println(listInt.size());
		System.out.println(listInt.toString());
		System.out.println(listInt.add(11));
		System.out.println(listInt.toString());
		System.out.println(listInt.add(11));
		System.out.println(listInt.toString());
		System.out.println(listInt.add(11));
		System.out.println(listInt.toString());
	}
}
