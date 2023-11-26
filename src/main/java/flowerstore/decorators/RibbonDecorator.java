package flowerstore.decorators;

import flowerstore.items.Item;

public class RibbonDecorator extends AbstractDecorator{
    private final int decoratorPrice = 40;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratorPrice + super.getPrice();
    }
}