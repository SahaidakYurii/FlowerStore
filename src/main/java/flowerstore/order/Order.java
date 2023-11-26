package flowerstore.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import flowerstore.delivery.Delivery;
import flowerstore.items.Item;
import flowerstore.payment.Payment;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    @Getter
    private double price;

    public void setPaymentStrategy(Payment paymentMethod) {
        this.payment = paymentMethod;
    }

    public void setDeliveryStrategy(Delivery deliveryMethod) {
        this.delivery = deliveryMethod;
    }

    void calculateTotalPrice() {
        double resultPrice = 0;

        for (Item item : items) {
            resultPrice += item.getPrice();
        }

        this.price = resultPrice;
    }

    void addItem(Item item) {
        items.add(item);
        this.price += item.getPrice();
    }

    void removeItem(Item item) {
        items.remove(item);
        this.price -= item.getPrice();
    }

    void processOrder() {
        System.out.printf("You have ordered %d items\n", items.size());
        System.out.printf(
                "The order is delivered according to %s delivery strategy",
                delivery.getClass().getSimpleName()
        );
        System.out.printf(
                "Payment is processed according to %s payment strategy",
                payment.getClass().getSimpleName()
        );
        System.out.printf("The price of the order is %f UAH", price);
    }
}
