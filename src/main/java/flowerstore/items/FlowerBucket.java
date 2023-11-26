package flowerstore.items;
import java.util.List;
import java.util.ArrayList;

public class FlowerBucket extends Item{
    private final List<FlowerPack> packs = new ArrayList<>();

    public void add(FlowerPack newPack){
        this.packs.add(newPack);
    }

    @Override
    public double getPrice(){
        double price = 0;

        for (FlowerPack pack : packs){
            price += pack.getPrice();
        }

        return price;
    }
}
