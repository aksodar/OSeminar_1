package ru.gb.oseminar;

import java.util.Objects;

public class HotDrink extends Product{

    private int volume;
    private int temperature;

    public HotDrink(String name, double cost, int volume, int temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() { return volume; }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() { return temperature; }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotDrink hotDrink = (HotDrink) o;

        return super.getName().equalsIgnoreCase(hotDrink.getName())
                && super.getCost() == hotDrink.getCost()
                && volume == hotDrink.volume
                && temperature == hotDrink.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, temperature);
    }

    @Override
    public String toString() {
        return "HotCoffee{" +
                "name=" + super.getName() +
                ", cost=" + super.getCost() +
                ", volume=" + this.volume +
                ", temperature=" + this.temperature +
                '}';
    }
}
