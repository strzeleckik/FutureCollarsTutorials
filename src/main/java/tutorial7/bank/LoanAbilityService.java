package tutorial7.bank;

public interface LoanAbilityService {
    boolean canPersonTakeALoan(String identityNumber, double amount);
}
