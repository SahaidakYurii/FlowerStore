package flower.items;

import flower.filters.properties.FlowerColor;
import flower.filters.properties.FlowerType;

public class Tulip extends Flower{
    public Tulip(){
        this.sepalLength = 5;
        this.color = FlowerColor.YELLOW;
        this.price = 6;
        this.flowerType = FlowerType.TULIP;
    }
}