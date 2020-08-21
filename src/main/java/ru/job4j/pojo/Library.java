package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] bookshelf = new Book[4];
        Book cleanCode = new Book("Clean code", 150);
        Book mobyDick = new Book("Moby Dick", 105);
        Book divineComedy = new Book("The Divine Comedy", 205);
        Book lordOfTheRings = new Book("The Lord of the Rings", 700);
        bookshelf[0] = cleanCode;
        bookshelf[1] = mobyDick;
        bookshelf[2] = divineComedy;
        bookshelf[3] = lordOfTheRings;
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.println("Name: " + bookshelf[i].getName() + ". Page: " + bookshelf[i].getPageCount());
        }
        Book temp = bookshelf[0];
        bookshelf[0] = bookshelf[3];
        bookshelf[3] = temp;
        for (int i = 0; i < bookshelf.length; i++) {
            System.out.println("Name: " + bookshelf[i].getName() + ". Page: " + bookshelf[i].getPageCount());
        }
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].getName().equals("Clean code")) {
                System.out.println("Name: " + bookshelf[i].getName() + ". Page: " + bookshelf[i].getPageCount());
            }
        }
    }
}
