package ru.gb.oseminar;

public class HotDrink extends BottleOfWater {
    private int tempreture;


    public HotDrink(String name, double cost, int volume, int tempreture) {
        super(name, cost, volume);
        this.tempreture = tempreture;
    }

    public int getTempreture() {
        return this.tempreture;
    }

    public void setTempreture(int tempreture) {
        this.tempreture = tempreture;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                "volume='" + super.getVolume() + '\'' +
                ", cost=" + super.getCost() +
                ", tempreture=" + this.tempreture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrink)) {
            return false;
        }

        HotDrink that = (HotDrink) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && super.getVolume() == that.getVolume()
                && this.tempreture == that.tempreture;
    }
}
