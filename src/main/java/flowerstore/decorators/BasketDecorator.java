package flowerstore.decorators;

import lombok.AllArgsConstructor;
import flowerstore.items.Item;

@AllArgsConstructor
public class BasketDecorator extends AbstractDecorator{
    private final Item item;
    private final int price = 4;

    @Override
    public double getPrice() {
        return price + item.getPrice();
    }
    
}
