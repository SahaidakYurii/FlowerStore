package flower.items;

import flower.filters.properties.FlowerColor;
import flower.filters.properties.FlowerType;

public class Rose extends Flower{
    public Rose(){
        this.sepalLength = 2;
        this.color = FlowerColor.RED;
        this.price = 7.5;
        this.flowerType = FlowerType.ROSE;
    }
}
