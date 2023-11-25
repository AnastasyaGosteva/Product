public class HotDrink extends BottleOfWater {

    private int temperature;

    public HotDrink(String name, int cost, int valume, int temperature) {
        super(name, cost, valume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotOfDrink {" + "name =" + super.getName() +
                ", cost = " + super.getCost() + ", volume = " + super.getVolume() + ", temperature" + temperature + '}';
    }

}
