package flower.store;
import java.util.ArrayList;
import java.util.List;

import flower.filters.Filter;
import flower.items.Item;

public class Store {
    private List<Item> availableItems;

    public List<Item> search(Filter filter){
        List<Item> matchingItems = new ArrayList<>();

        for (Item toCheck : availableItems){
            if (filter.match((toCheck))){matchingItems.add(toCheck);}
        }

        return matchingItems;
    }
}
