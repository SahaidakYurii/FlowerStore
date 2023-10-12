package flower.filters;
import flower.items.Item;

public interface Filter {
    boolean match(Item item);
}
