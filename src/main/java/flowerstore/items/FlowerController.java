package flowerstore.items;

import flowerstore.properties.FlowerColor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {
    public final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }

    @GetMapping("/")
    public Flower index() {
        return new Flower(5, 10, FlowerColor.BLUE);
    }
}