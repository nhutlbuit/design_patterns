package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Services.BookShelf.WoodBookShelf;
import Creational.AbstractFactory.Services.Chair.WoodChair;
import Creational.AbstractFactory.Services.IBookShelf;
import Creational.AbstractFactory.Services.IChair;
import Creational.AbstractFactory.Services.ITable;
import Creational.AbstractFactory.Services.IWardrobe;
import Creational.AbstractFactory.Services.Table.WoodTable;
import Creational.AbstractFactory.Services.Wardrobe.WoodWardrobe;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public IChair createChair() {
        return new WoodChair();
    }

    @Override
    public ITable createTable() {
        return new WoodTable();
    }

    @Override
    public IBookShelf createBookShelf() {
        return new WoodBookShelf();
    }

    @Override
    public IWardrobe createWardrobe() {
        return new WoodWardrobe();
    }
}
