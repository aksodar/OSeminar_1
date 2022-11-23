package ru.gb.oseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotDrinkVendingMachineTest {
    private List<Product> products;
    private HotDrinkVendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        this.vendingMachine = new HotDrinkVendingMachine(products);
    }

    @Test
    void getProductTestSuccessful() {
        // expected
        products.add(new HotDrink("ExampleName1", 1.0d, 1000, 80));
        products.add(new HotDrink("ExampleName2", 2.0d, 500, 90));
        this.vendingMachine = new HotDrinkVendingMachine(products);
        HotDrink expected = new HotDrink("ExampleName2", 2.0d, 500, 90);

        // actual
        HotDrink actual = vendingMachine.getProduct("ExampleName2", 500,90);

        Assertions.assertEquals(expected, actual);
    }
}