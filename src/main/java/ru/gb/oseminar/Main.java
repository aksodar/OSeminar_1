import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        List<Product> hot_Drink = new ArrayList<>(Arrays.asList(
            new HotDrink("Esspresso", 5, 1, 70),
            new HotDrink("Latte", 6, 1, 45),
            new HotDrink("HotChocolate", 4, 1, 55),
            new HotDrink("Black Tea", 3, 1, 70),
            new HotDrink("Green Tea", 2, 1, 70))
        );
        HotDrinkMachine hot_Drink_Machine = new HotDrinkMachine(hot_Drink);
        log.info(hot_Drink_Machine.getProductByName("Esspresso").toString());
        log.info(hot_Drink_Machine.getProduct("HotChocolate", 1, 55).toString());
    }
}