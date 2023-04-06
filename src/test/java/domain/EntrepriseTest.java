package domain;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.xpath.XPathResult;
import paie.domain.Employee;
import paie.domain.Entreprise;
import paie.domain.bank.PaymentService;

import static org.mockito.Mockito.mock;

public class EntrepriseTest {

    private static final int WEEKS_PER_PERIOD = 4;
    private PaymentService paymentService;
    private Entreprise target;

    @Before
    public void setUp() {
        paymentService = mock(PaymentService.class);
        target = new Entreprise(WEEKS_PER_PERIOD,paymentService);
    }

    //region payEmployeesForOnePeriod

    @Test
    public void givenAnEmployee_whenPayEmployeesForOnePeriod_thenPaymentIsGivenToEmployeeAccount()
    {
        //given
        Employee anEmployee = mock(Employee.class);

        //when
        target.payEmployeesForOnePeriod();

        //then

    }


    //endregion

}
