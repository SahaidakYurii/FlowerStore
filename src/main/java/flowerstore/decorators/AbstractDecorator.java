package flowerstore.decorators;

import flowerstore.items.Item;

public abstract class AbstractDecorator extends Item{
    private final Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }
}
