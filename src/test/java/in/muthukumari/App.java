package in.muthukumari.transfermoney;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesterForListOfBank {

	/**
	 * TestCase for no bank name
	 */
	@Test
	public void testCase1() {
		OperationsOnBankList.displayBankList();
		int noOfBanks = OperationsOnBankList.getNoOfBanks();
		System.out.println(noOfBanks);

	}

	@Test
	public void testCase2() {
		String bankName = " Indian bank";
		boolean bankNameValidation = CustomerBankDetailValidation.nameValidation(bankName);
		assertEquals(false,bankNameValidation);
		//OperationsOnBankList.addBankList(bankName);
		//OperationsOnBankList.displayBankList();
		//int noOfBanks = OperationsOnBankList.getNoOfBanks();
		//System.out.println(noOfBanks);

	}

	@Test
	public void testCase3() {
		String bankName = "Indian Overseas Bank";
		boolean bankNameValidation = CustomerBankDetailValidation.nameValidation(bankName);
		assertEquals(true,bankNameValidation);
	}

	@Test
	public void testCase4() {
		String bankName = " ";
		boolean bankNameValidation = CustomerBankDetailValidation.nameValidation(bankName);
		assertEquals(false,bankNameValidation);
		}
}

}
