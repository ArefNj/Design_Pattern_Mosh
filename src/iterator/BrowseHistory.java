package iterator;

public class BrowseHistory {
    private final String[] urls = new String[10];
    private int size;

    public void push(String url) {
        urls[size++] = url;
    }

    public String pop() {
        return urls[--size];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    /**
     * List Iterator
     */
//    public class ListIterator implements Iterator {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//
//        }
//    }

    public class ArrayIterator implements Iterator<String> {

        private final BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < size);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
