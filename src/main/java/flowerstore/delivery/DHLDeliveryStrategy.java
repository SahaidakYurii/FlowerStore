package flowerstore.delivery;

import flowerstore.items.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items){
        return "You have ordered DHL delivery for " + items.size() + " items.";
    }
}
