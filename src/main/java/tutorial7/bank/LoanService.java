package tutorial7.bank;

public class LoanService {

    private LoanAbilityService loanAbilityService;

    public LoanService(LoanAbilityService loanAbilityService) {
        this.loanAbilityService = loanAbilityService;
    }

    public boolean takeLoan(String identityNumber, double amount){
        if(loanAbilityService.canPersonTakeALoan(identityNumber, amount)){
            String accountNumber = getAccountNumberOfClient(identityNumber);
            transferMoney(accountNumber, amount);
            return true;
        }

        loanAbilityService.canPersonTakeALoan(identityNumber, amount);

        return false;
    }

    private String getAccountNumberOfClient(String identityNumber){
        return "acc123-123";
    }

    private void transferMoney(String accountNumber, double amount){
        //transfering money

    }
}
