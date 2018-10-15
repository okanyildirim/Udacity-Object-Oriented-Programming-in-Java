package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
/*
    ArrayList<Book> books;

    Book findBookByISBN(String isbn){
        for(Book book : library.allBooks){
            if(book.ISBN.equals(isbn)){
                return book;
            }
        }
*/
HashMap<String,Book> books= new HashMap<>();

    Book findBookByISBN(String isbn){
        Book book = books.get(isbn);
        return book;
    }




}
