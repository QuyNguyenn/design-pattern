package com.quynn;

import com.quynn.model.Book;

import java.util.Objects;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book1 = new Book("Thu vien luc nua dem", "978-604-333-576-7");
        Book book2 = (Book) book1.clone();
        System.out.println(book1);
        System.out.println(book2);
    }
}
