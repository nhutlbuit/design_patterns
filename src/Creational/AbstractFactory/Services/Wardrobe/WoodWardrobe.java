package Creational.AbstractFactory.Services.Wardrobe;

import Creational.AbstractFactory.Services.IWardrobe;

public class WoodWardrobe implements IWardrobe {
    @Override
    public void create() {
        System.out.println("Create wood wardrobe");
    }
}
