package exercises.switch_factory;
//class not working !!!!!!! todo: доделать клас который использует данную абстрактную фабрику
public class Calculations {
    public static void main(String[] args) {
        Employee employee = new Employee() {
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
        EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();
        employeeFactory.makeEmployee().isPayday();
    }
}
