package flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment{
    
    @Override
    public String pay(double price){
        return "You have paid " + price + " UAH by credit card";
    }
}
