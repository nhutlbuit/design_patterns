package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Enum.MaterialType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FurnitureFactory {
    private FurnitureFactory() {

    }
//    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
//        switch (materialType) {
//            case FLASTIC:
//                return new FlasticFactory();
//            case WOOD:
//                return new WoodFactory();
//            default:
//                throw new UnsupportedOperationException("This furniture is unsupported ");
//        }
//    }

    // java 8 Supplier
    private final static Map<MaterialType, Supplier<FurnitureAbstractFactory>> map = new HashMap<>();

    static {
        map.put(MaterialType.FLASTIC, FlasticFactory::new);
        map.put(MaterialType.WOOD, WoodFactory::new);
    }

    public static final FurnitureAbstractFactory getFactory(MaterialType materialType) {
        Supplier<FurnitureAbstractFactory> material = map.get(materialType);
        if (material == null) {
            throw new IllegalArgumentException("This furniture is unsupported ");
        }
        return material.get();
    }
}
