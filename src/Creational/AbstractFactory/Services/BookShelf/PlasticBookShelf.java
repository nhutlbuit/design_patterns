package Creational.AbstractFactory.Services.BookShelf;

import Creational.AbstractFactory.Services.IBookShelf;

public class PlasticBookShelf implements IBookShelf {
    @Override
    public void create() {
        System.out.println("Create plastic Bookshelf");
    }
}
