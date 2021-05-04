package in.muthukumari;

import java.util.ArrayList;

public class OperationsOnBankList {
	static ArrayList<String> banklist = new ArrayList<String>();

	public static void addBankList(String bankName) {
		//banklist.add("Indian Bank");
		//banklist.add("Indian Overseas Bank");
		//banklist.add("Union Bank of India");
		banklist.add(bankName);
	}

	public static int getNoOfBanks() {

		int noOfBanks = banklist.size();
		return noOfBanks;
	}

	public static void displayBankList() {

		System.out.println("------------- List of Banks ------------");
		for (String bankName : banklist) {
			System.out.println(bankName);
		}
	}
}
