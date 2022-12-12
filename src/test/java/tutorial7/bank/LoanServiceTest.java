package tutorial7.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class LoanServiceTest {

    private LoanAbilityService loanAbilityService;

    private LoanService objectUnderTest;

    @BeforeEach
    public void beforeEachTest(){
        loanAbilityService = Mockito.mock(LoanAbilityService.class);
        objectUnderTest = new LoanService(loanAbilityService);
    }

    @Test
    void shouldReturnTrueWhenGetALoan() {
        //given
        Mockito.when(loanAbilityService.canPersonTakeALoan(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(true);

        //when
        boolean result = objectUnderTest.takeLoan("1234123", 10000.5);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenLoanAbilityCheckFailed() {
        //given
        Mockito.when(loanAbilityService.canPersonTakeALoan(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(false);

        //when
        boolean result = objectUnderTest.takeLoan("1234123", 10000.5);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldCallCanPersonTakeALoanAtLeastTwoTimes() {
        //given
        Mockito.when(loanAbilityService.canPersonTakeALoan(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble())).thenReturn(false);

        //when
        objectUnderTest.takeLoan("1234123", 10000.5);

        //then
        Mockito.verify(loanAbilityService, Mockito.times(2)).canPersonTakeALoan(ArgumentMatchers.anyString(), ArgumentMatchers.anyDouble());
    }
}