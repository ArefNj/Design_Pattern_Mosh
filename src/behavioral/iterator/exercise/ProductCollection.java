package behavioral.iterator.exercise;

import behavioral.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator(this);
    }

    private  class ListIterator implements Iterator<Product> {
        private final ProductCollection collection;
        private int index;

        public ListIterator(ProductCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return (index < collection.products.size());
        }

        @Override
        public Product current() {
            return collection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
