package com.tnsif.day7.polymorphism.overloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add();
		System.out.println(a.add(6));
		System.out.println(a.add(6,7));
		System.out.println(a.add(6,7));
		a.show(101,"Ragavi");
		a.show("Ragavi",101);
		
		
	}
}
