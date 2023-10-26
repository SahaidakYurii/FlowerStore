package flowerstore.store;
import java.util.ArrayList;
import java.util.List;

import flowerstore.filters.Filter;
import flowerstore.items.Item;

public class Store {
    private List<Item> availableItems;

    public List<Item> search(Filter filter){
        List<Item> matchingItems = new ArrayList<>();

        for (Item toCheck : availableItems){
            if (filter.match((toCheck))){
                matchingItems.add(toCheck);
            }
        }

        return matchingItems;
    }
}
