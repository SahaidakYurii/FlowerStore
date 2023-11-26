package flowerstore.items;

import lombok.Getter;

@Getter
public abstract class Item{
    public abstract double getPrice();
    private String description;
}