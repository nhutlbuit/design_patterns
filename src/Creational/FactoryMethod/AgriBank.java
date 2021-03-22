package Creational.FactoryMethod;

public class AgriBank implements Bank {

    @Override
    public String getBankName() {
        return "AgriBank";
    }

    @Override
    public String getBankNumber() {
        return "0123456789";
    }

    @Override
    public String getBankType() {
        return "Debit";
    }
}
