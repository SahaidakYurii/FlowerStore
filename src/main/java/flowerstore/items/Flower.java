package flowerstore.items;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import flowerstore.properties.FlowerColor;
import flowerstore.properties.FlowerType;
import java.util.Random;


@AllArgsConstructor @NoArgsConstructor @ToString @Entity
@Setter
public class Flower {
    @Id
    private Integer id;
    @Getter
    protected double sepalLength;
    @Getter
    protected FlowerColor color;
    @Getter
    protected double price;
    @Getter
    protected FlowerType flowerType;

    public Flower(Flower flower){
        this.sepalLength =  flower.sepalLength;
        this.color =        flower.color;
        this.price =        flower.price;
        this.flowerType =   flower.flowerType;
    }

    public Flower(int sepalLength, double price,  FlowerColor color){
        Random rand = new Random();
        this.sepalLength =  sepalLength;
        this.color =        color;
        this.price =        price;
        this.flowerType =   FlowerType.values()[rand.nextInt(FlowerType.values().length)];
    }
}
