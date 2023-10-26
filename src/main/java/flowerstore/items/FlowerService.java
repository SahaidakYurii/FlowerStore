package flowerstore.items;

import flowerstore.properties.FlowerColor;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class FlowerService {
    public List<Flower> getFlowers(){
        return List.of(new Flower(1, 45, FlowerColor.RED));
    }
}
