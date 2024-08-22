import Lesson6.CreditCard;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCard[] creditCards = new CreditCard[]{
                new CreditCard("MasterCard", 100),
                new CreditCard("Visa", 200),
                new CreditCard("Maestro", 300)
        };

        creditCards[0].addCash(100);
        creditCards[1].addCash(100);
        creditCards[2].withdrawal(100);


        for (CreditCard creditCard : creditCards) {
            System.out.println(creditCard.toString());
        }
    }
}