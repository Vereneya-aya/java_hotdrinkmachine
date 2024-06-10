public class HotDrink {
    private String name;
    private double cost;
    private int volume;
    protected int temperature;

    public HotDrink() {
        this.name = "HotDrink";
        this.cost = 0;
    }

    public HotDrink(String name, double cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public String toString() {
        return "HotDrink{" +
               "name='" + name + '\'' +
               ", cost=" + cost +
               '}';
    }

    
}
