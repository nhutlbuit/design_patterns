package Creational.AbstractFactory.Services.Chair;

import Creational.AbstractFactory.Services.IChair;

public class WoodChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
