package flowerstore.delivery;

import flowerstore.items.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<Item> items);
}
