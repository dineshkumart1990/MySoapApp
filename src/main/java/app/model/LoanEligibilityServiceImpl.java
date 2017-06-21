package app.model;

public class LoanEligibilityServiceImpl implements LoanEligibilityService{

	@Override
	public LoanEligibilityResponseType getLoanEligibility(LoanEligibilityRequestType loanEligibilityRequest) {
		LoanEligibilityResponseType value = new LoanEligibilityResponseType();
		int age = 30;
		if(age < 20){
			value.setEligibilityCode("100");
			value.setEligibilityMessage("Not Eligible");
			return value;
		}else if ((age > 20 && age < 25) && loanEligibilityRequest.getAnnualSalary() > 60000 && loanEligibilityRequest.getAmount() < 20000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else if ((age > 25 && age < 30) && loanEligibilityRequest.getAnnualSalary() > 80000 && loanEligibilityRequest.getAmount() < 20000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else if ((age > 30 && age < 50) && loanEligibilityRequest.getAnnualSalary() > 100000 && loanEligibilityRequest.getAmount() < 50000){
			value.setEligibilityCode("200");
			value.setEligibilityMessage("Eligible");
			return value;
		}else{
			value.setEligibilityCode("100");
			value.setEligibilityMessage("Not Eligible");
			return value;
		}
		
	}

}
