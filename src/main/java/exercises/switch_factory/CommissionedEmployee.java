package exercises.switch_factory;

public class CommissionedEmployee extends Employee {
    public CommissionedEmployee(EmployeeRecord r) {
        super();
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliveryPay(Money pay) {

    }
}
