package Creational.Builder.builder;

import Creational.Builder.product.order.Order;
import Creational.Builder.product.type.BreadType;
import Creational.Builder.product.type.OrderType;
import Creational.Builder.product.type.SauceType;
import Creational.Builder.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
