package flowerstore.decorators;

import flowerstore.items.Item;

public class BasketDecorator extends AbstractDecorator{
    private final int decoratorPrice = 4;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratorPrice + super.getPrice();
    }
}
