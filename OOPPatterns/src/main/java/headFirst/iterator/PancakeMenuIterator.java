package iterator;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList items;
    int position =0;

    public PancakeMenuIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object menuItem = items.get(position);
        position = position+1;
        return menuItem;
    }

    public boolean hasNext() {
        if ( position>= items.size()|| items.get(position) == null) {
            return false;
        }
        else return true;
    }
}
