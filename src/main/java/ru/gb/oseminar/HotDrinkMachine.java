import java.util.List;


public class HotDrinkMachine extends Machine {

    public HotDrinkMachine (List<Product> products) {
        super(products);
    }

    public Product getProduct (String name, Integer volume, Integer temperature) {
        List<Product> products = getProduct();

        for (Product product : products) {
            if (Product instanceof HotDrink) {
                HotDrink hot_Drink = (HotDrink) product;
                if (hot_Drink.getName().equals(name) && hot_Drink.getVolume().equals(volume) && hot_Drink.getTemperature().equals(temperature)) {
                    return hot_Drink;
                }
            }
        }
        throw new IllegalStateException("Hot drink is not found");
    }
}