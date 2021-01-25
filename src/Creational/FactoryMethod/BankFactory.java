package Creational.FactoryMethod;

public class BankFactory {

    private BankFactory() {}

    public static final Bank getBankName(BankType bankType) {

        switch (bankType) {
            case AGRIBANK:
                return new AgriBank();
            case VIETCOMBANK:
                return new VietComBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported!");
        }
    };
}
