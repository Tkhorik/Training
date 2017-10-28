package exercises.switch_factory;

public class EmployeeFactoryImpl implements EmployeeFactory {


    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        switch (r.type) {
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARED:
                return new SalariedEmployer(r);
            default:
                throw new InvalidEmployeeType(r.type);
        }
    }
}
