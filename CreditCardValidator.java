public class CreditCardValidator {
    private int[] creditCard;
    int multiply = 1;

    public void validate(int[] creditCard) {
        this.creditCard = creditCard;
        for (int i = creditCard.length-1; i >= 0 ; i-=2) {
           multiply = creditCard[i] * 2;
        }
        System.out.println(multiply);
    }
}
