package books.model;

import java.util.Objects;

public class Book {
    private long isbn;
    private int yearOfPublishing;
    private String author;

    public Book(long isbn, int yearOfPublishing, String author) {
        this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", yearOfPublishing=" + yearOfPublishing +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
