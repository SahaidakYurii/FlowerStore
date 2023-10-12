package flower.items;

import lombok.Getter;
import lombok.Setter;
import java.util.Random;

import flower.filters.properties.FlowerColor;
import flower.filters.properties.FlowerType;



@Setter
public class Flower {
    @Getter
    protected double sepalLength;
    @Getter
    protected FlowerColor color;
    @Getter
    protected double price;
    @Getter
    protected FlowerType flowerType;

    public Flower(){
        Random rand = new Random();
        this.sepalLength =  rand.nextInt(5);
        this.color = FlowerColor.values()[rand.nextInt(FlowerColor.values().length)];
        this.price = rand.nextDouble(10);
        this.flowerType = FlowerType.values()[rand.nextInt(FlowerType.values().length)];
    }

    public Flower(Flower flower){
        this.sepalLength =  flower.sepalLength;
        this.color =        flower.color;
        this.price =        flower.price;
        this.flowerType =   flower.flowerType;
    }
}
