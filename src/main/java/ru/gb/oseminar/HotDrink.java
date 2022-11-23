public class HotDrink extends BottleOfWater {
    private Integer temperature;

    public HotDrink (String name, Integer volume, Integer temperature, Integer cost) {
        super (name, volume, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = '" + super.getName() +
                "', cost = " + super.getVolume() +
                ", temperature = " + temperature +
                ", cost = " + super.getCost() +
                "}";
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
}

