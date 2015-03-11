package com.tutorial.basics.stringbufferbuilder;

public class StringBufferBuilder {

	public static void main(String[] args) {
		String name = "Jayram";
		name = name + "Rout";
		String test = "Jayram";
		
		String [] names = {"One","Two","Three","Four"};
		
		StringBuilder sfChar = new StringBuilder();
		
		String firstChar = "";
		for(String nam : names) {
//			firstChar += nam.charAt(0);
//			firstChar.concat(str)
			sfChar.append(nam.charAt(0));
		}
		
		System.out.println(sfChar);
	}
}
