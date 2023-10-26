package flowerstore.decorators;

import flowerstore.items.Item;

public abstract class AbstractDecorator extends Item{
    private int price;
    public abstract double getPrice();
}
