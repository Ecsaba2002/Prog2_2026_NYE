public class Library {

    private String[] books;

    public Library(String[] books) {
        this.books = books;
    }

    // Inner class: BookIterator
    public class BookIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < books.length;
        }

        public String nextTitle() {
            if (!hasNext()) {
                throw new IllegalStateException("No more books!");
            }
            return books[index++];
        }
    }

    public BookIterator iterator() {
        return new BookIterator();
    }

    public static void main(String[] args) {
        String[] titles = {"Dűne", "Egri csillagok", "A Gyűrűk Ura"};
        Library lib = new Library(titles);

        Library.BookIterator it = lib.iterator();

        while (it.hasNext()) {
            System.out.println(it.nextTitle());
        }
    }
}
