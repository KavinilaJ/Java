
package Practice7;

class LibraryBook {
    private String title;
    private String author;
    private boolean available; 

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; 
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' by " + author + " has been returned.");
        } else {
            System.out.println("Error: This book is already available in the library.");
        }
    }
}

class Library {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Harry Potter", "J.K.Rowling");
        //book.borrowBook();
        book.getAuthor();
        book.getTitle();
        book.isAvailable();
       // book.returnBook();
    }
}

