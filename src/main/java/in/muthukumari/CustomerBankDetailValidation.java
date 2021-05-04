package in.muthukumari;

public class CustomerBankDetailValidation {
	/**
	 * This method used to validate the name of the customer
	 * @param name
	 * @return
	 */
	public static boolean nameValidation(String name) {
		boolean isValid = true;// set isValid variable is true
		// Check the customer name is equal to null or is an empty space
		if (name == null || name.trim().equals("")) {
			isValid = false;// if the condition is false set isValid variable is false
		}
		
		//return isValid;// return the isValid variable
		if(isValid==true)
		{
			OperationsOnBankList.addBankList(name);
			OperationsOnBankList.displayBankList();
			int noOfBanks = OperationsOnBankList.getNoOfBanks();
			System.out.println(noOfBanks);
		
		} else {
		System.out.println("Enter Valid Bank Name");
	}
		return isValid;
	}

}
