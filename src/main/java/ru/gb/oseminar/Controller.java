package ru.gb.oseminar;

import java.util.Arrays;

public class Controller {
    public static void main(String[] args) {
        HotDrink azerChai1 = new HotDrink("Azer chai_large", 400, 2, 60);
        HotDrink azerChai2 = new HotDrink("Azer chai_small", 170, 1, 60);
        HotDrink akhmatChai1 = new HotDrink("Akhmat chai", 190, 1, 70);
        HotDrinkVendingMachine machineDryNotBeHot = new HotDrinkVendingMachine(Arrays.asList(azerChai1, azerChai2, akhmatChai1));
        System.out.println(machineDryNotBeHot);
        System.out.println(machineDryNotBeHot.getProduct("Azer chai_large"));
        System.out.println(machineDryNotBeHot.getProduct("Azer chai_small", 1));
        System.out.println(machineDryNotBeHot.getProduct("Azer chai_small",1,60));
    }
}
