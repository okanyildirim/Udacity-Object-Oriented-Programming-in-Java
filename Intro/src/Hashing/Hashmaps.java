package Hashing;

import java.util.HashMap;

public class Hashmaps {

    public static void main(String[] args) {

        HashMap<String,Book> books= new HashMap<>();

        Book ElonMusk=new Book();
        ElonMusk.ISBN="123456789";
        Book kürkMantoluMadonnna=new Book();
        kürkMantoluMadonnna.ISBN="65465645646";

        Book taleOfTwoCities = new Book();

        books.put("9781539687399", taleOfTwoCities);
        books.put(ElonMusk.ISBN,ElonMusk);

        Library library=new Library();

        }
}
