package flowerstore.delivery;

import java.util.List;

import flowerstore.items.Item;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items){
        return "You have ordered Post delivery for " + items.size() + " items.";
    }
}
