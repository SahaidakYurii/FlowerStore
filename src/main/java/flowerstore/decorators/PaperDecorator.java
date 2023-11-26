package flowerstore.decorators;

import flowerstore.items.Item;

public class PaperDecorator extends AbstractDecorator{
    private final int decoratorPrice = 13;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return decoratorPrice + super.getPrice();
    }
}