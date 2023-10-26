package flowerstore.filters;
import flowerstore.items.Item;

public interface Filter {
    boolean match(Item item);
}
