package paie.infrastructure.acmebank;


import paie.domain.bank.BankingAccountNumber;
import paie.domain.bank.PaymentService;
import paie.domain.bank.PaymentServiceException;

import java.util.Random;

public class AcmePaymentService implements PaymentService {

    public void makePayment(double amount, BankingAccountNumber recipient) throws PaymentServiceException {
        if (new Random().nextBoolean()) {
            throw new PaymentServiceException("Error while accessing the ACME payment service.");
        }
    }
}
