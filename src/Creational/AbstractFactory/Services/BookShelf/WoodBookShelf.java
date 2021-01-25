package Creational.AbstractFactory.Services.BookShelf;

import Creational.AbstractFactory.Services.IBookShelf;

public class WoodBookShelf implements IBookShelf {
    @Override
    public void create() {
        System.out.println("Create wood Bookshelf");
    }
}
