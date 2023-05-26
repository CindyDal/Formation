package paie.domain.bank;
//FIXME CDA DON'T TOUCH
public interface PaymentService {

    void makePayment(double amount, BankingAccountNumber recipient);

}
