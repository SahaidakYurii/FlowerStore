package flower.items;

import flower.filters.properties.FlowerColor;
import flower.filters.properties.FlowerType;

public class Chamomile extends Flower{
    public Chamomile(){
        this.sepalLength = 1;
        this.color = FlowerColor.WHITE;
        this.price = 3;
        this.flowerType = FlowerType.CHAMOMILE;
    }
}