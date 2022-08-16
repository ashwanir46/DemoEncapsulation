package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("book.getTitle() = " + book.getTitle());
        book.setTitle("java");
        System.out.println("book.getTitle() = " + book.getTitle());
        System.out.println("book.getIsbnNumber() = " + book.getIsbnNumber());
        book.setIsbnNumber(37283473);
        System.out.println("book.getIsbnNumber() = " + book.getIsbnNumber());
        System.out.println("book.getYearOfPublish() = " + book.getYearOfPublish());
        book.setYearOfPublish(2005);
        System.out.println("book.getYearOfPublish() = " + book.getYearOfPublish());
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
        book.setAuthorName("james gosling");
        System.out.println("book.getAuthorName() = " + book.getAuthorName());
    }
}
