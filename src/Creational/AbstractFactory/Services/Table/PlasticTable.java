package Creational.AbstractFactory.Services.Table;

import Creational.AbstractFactory.Services.ITable;

public class PlasticTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
