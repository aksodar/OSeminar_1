package ru.gb.oseminar;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
