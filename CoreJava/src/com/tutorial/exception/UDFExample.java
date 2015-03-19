package com.tutorial.exception;

public class UDFExample {

	public static void main(String[] args) {

		/*
		 * int firstValue = 0; try { if (firstValue == 0) throw new
		 * UserDefinedException(" Please pass +ve number more than zero"); }
		 * catch (UserDefinedException e) { e.printStackTrace(); }
		 */

		/*try {
			doBusinessFunctionality();
			doMyHomework(null);
		} catch (UserDefinedException e) {
			e.printStackTrace();
		}catch(HomeWorkException hwe) {
			hwe.printStackTrace();
		}*/
		try {
			doBusinessFunctionality();
			doMyHomework(null);
		} catch (HomeWorkException | UserDefinedException e) {
			e.printStackTrace();
		}
	}

	public static void doBusinessFunctionality() throws UserDefinedException {
		try {
			int value = 50 / 0;
		} catch (Exception e) {
			throw new UserDefinedException("Add +ve value");
		}
	}

	public static void doMyHomework(String homeworkName)
			throws HomeWorkException {
		homeworkName.toString();
		
		/*try {
			
		} catch (Exception e) {
			throw new HomeWorkException("Howe should not be NULL");
		}*/
		
		/*try {
			doInTime(0);
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		doInTime(0);
//		doSchoolHW(); // throws SchoolException
	}

	public static void doInTime(int minutes) throws HomeWorkException {
		if (minutes == 0) {
			throw new HomeWorkException(" Minutes shud be more than zero");
		}
	}
	
}