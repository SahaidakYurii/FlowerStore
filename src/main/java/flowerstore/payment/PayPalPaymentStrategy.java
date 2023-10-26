package flowerstore.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double price){
        return "You have paid " + price + " UAH by PayPal";
    }
}
