package flowerstore.items;
import lombok.Setter;
import lombok.Getter;

@Getter
public class FlowerPack extends Item{
    @Setter
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity){
        setQuantity(quantity);
        this.flower = flower;
    }

    public FlowerPack(Flower flower){
        setQuantity(1);
        this.flower = new Flower(flower);
    }
    
    void setQuantity(int flowersQuantity){
        this.quantity = flowersQuantity > 1 ? flowersQuantity : 1;
    }

    @Override
    public double getPrice(){
        return flower.getPrice() * quantity;
    }
}
