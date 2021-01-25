package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
       // Bank bank = BankFactory.getBankName(BankType.AGRIBANK);
        Bank bank = BankFactory.getBankName(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());
    }
}
