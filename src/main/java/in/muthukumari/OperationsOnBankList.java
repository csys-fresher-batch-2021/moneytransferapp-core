package in.muthukumari;

import java.util.ArrayList;

public class OperationsOnBankList {
	static ArrayList<String> bankList = new ArrayList<String>();

	public static void addBankList(String bankName) {
		//bankList.add("Indian Bank");
		//bankList.add("Indian Overseas Bank");
		//bankList.add("Union Bank of India");
		bankList.add(bankName);
	}

	public static int getNoOfBanks() {

		int noOfBanks = bankList.size();
		return noOfBanks;
	}

	public static void displayBankList() {

		System.out.println("------------- List of Banks ------------");
		for (String bankName : bankList) {
			System.out.println(bankName);
		}
	}
}
