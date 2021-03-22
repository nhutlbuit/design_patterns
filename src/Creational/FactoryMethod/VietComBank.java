package Creational.FactoryMethod;

public class VietComBank implements Bank{

    @Override
    public String getBankName() {
        return "VietComBank";
    }

    @Override
    public String getBankNumber() {
        return "4252626";
    }

    @Override
    public String getBankType() {
        return "Credit";
    }
}
