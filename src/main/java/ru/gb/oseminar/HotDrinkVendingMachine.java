package ru.gb.oseminar;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotDrinkVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equalsIgnoreCase(name)
                        && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int tempreture) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name)
                        && ((BottleOfWater) product).getVolume() == volume
                        && ((HotDrink) product).getTempreture() == tempreture) {
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    @Override
    public String toString() {
        return "HotDrinkVendingMachine{" +
                "products=" + products +
                '}';
    }
}
