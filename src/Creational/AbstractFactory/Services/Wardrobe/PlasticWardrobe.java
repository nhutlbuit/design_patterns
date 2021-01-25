package Creational.AbstractFactory.Services.Wardrobe;

import Creational.AbstractFactory.Services.IWardrobe;

public class PlasticWardrobe implements IWardrobe {
    @Override
    public void create() {
        System.out.println("Create plastic wardrobe");
    }
}
