package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Services.BookShelf.PlasticBookShelf;
import Creational.AbstractFactory.Services.Chair.PlasticChair;
import Creational.AbstractFactory.Services.IBookShelf;
import Creational.AbstractFactory.Services.IChair;
import Creational.AbstractFactory.Services.ITable;
import Creational.AbstractFactory.Services.IWardrobe;
import Creational.AbstractFactory.Services.Table.PlasticTable;
import Creational.AbstractFactory.Services.Wardrobe.PlasticWardrobe;

public class FlasticFactory extends FurnitureAbstractFactory {
    @Override
    public IChair createChair() {
        return new PlasticChair();
    }

    @Override
    public ITable createTable() {
        return new PlasticTable();
    }

    @Override
    public IBookShelf createBookShelf() {
        return new PlasticBookShelf();
    }

    @Override
    public IWardrobe createWardrobe() {
        return new PlasticWardrobe();
    }
}
