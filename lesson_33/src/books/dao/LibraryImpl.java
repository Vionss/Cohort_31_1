package books.dao;

import books.model.Book;

public class LibraryImpl implements Library {
    private Book[] books;
    private int size;

    // constructor
    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        // проверки на "плохие" данные на вход - не null, не больше capacity, не уже существующую книгу
        if(book == null || size == books.length || findBookByIsbn(book.getIsbn()) != null){
            return false;
        }
        books[size] = book;
        size++;
        return false;
    }

    @Override
    public Book removeBook(long isbn) {
        Book bookForRemove = null;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                bookForRemove = books[i];
                books[i] = books[size - 1]; // последнюю книгу поставили на место найденной
                books[size] = null; // затираем последний элемент
                size--;
            }
        }
        return bookForRemove;
    }

    @Override
    public Book findBookByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findByAuthor(String author) {
        return new Book[0];
    }

    @Override
    public int size() {
        return size;
    }
}
