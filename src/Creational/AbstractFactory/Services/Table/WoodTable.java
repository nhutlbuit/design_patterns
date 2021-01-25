package Creational.AbstractFactory.Services.Table;

import Creational.AbstractFactory.Services.ITable;

public class WoodTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
