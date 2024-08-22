package Lesson6;

public class CreditCard {
    private String paymentSystem;
    private int sum;

    public CreditCard(String paymentSystem, int sum) {
        this.paymentSystem = paymentSystem;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "paymentSystem = " + paymentSystem + " - " + sum + " USD";
    }

    public void addCash(int add) {
        this.sum = this.sum + add;
    }

    public void withdrawal (int withdrawal) {
        this.sum = this.sum - withdrawal;
    }
}
