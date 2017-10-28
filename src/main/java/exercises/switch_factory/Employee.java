package exercises.switch_factory;

public abstract class Employee {
    public abstract boolean isPayday();

    public abstract Money calculatePay();

    public abstract void deliveryPay(Money pay);
}
