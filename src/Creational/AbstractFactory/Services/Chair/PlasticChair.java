package Creational.AbstractFactory.Services.Chair;

import Creational.AbstractFactory.Services.IChair;

public class PlasticChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
