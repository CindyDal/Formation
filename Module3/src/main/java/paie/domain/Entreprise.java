package paie.domain;

import paie.domain.bank.PaymentService;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private List<Employee> employees = new ArrayList<Employee>();

    public Entreprise(int weeksPerPeriod, PaymentService paymentService) {
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean hasEmployee(Employee employee) {
        return employees.contains(employee);
    }

    public void payEmployeesForOnePeriod() {
        // *** A COMPLETER *** //
    }

}
