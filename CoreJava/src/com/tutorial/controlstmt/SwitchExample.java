package com.tutorial.controlstmt;

// package com.h2kinfosys.corejava.loops
public class SwitchExample {
	// www.h2kinfosys.com
	public static void main(String[] args) {
		int value = Integer.parseInt(args[0]);

		/*if (value == 3) {
			System.out.println("Three");
		} else if (value == 4) {
			System.out.println("Four");
		} else if (value == 5) {
			System.out.println("Five");
			System.out.println("Five Again");
		} else if (value == 6) {
			System.out.println("Six");
		}else {
			System.out.println("Nothing satisfied..");
		}*/

		switch (value) {
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			System.out.println("Four Again");
			break;
		case 5:{
			System.out.println("Five");
			System.out.println("Five");
			break;
		}
		case 6:
			System.out.println("Six");
			break;
		default:
			break;
		}
	}

}
