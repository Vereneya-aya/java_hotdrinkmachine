public class CoffeeAmericano extends HotDrink {
    protected int temperature;

    public CoffeeAmericano() {
        super();
    }


    public CoffeeAmericano(String name, double cost, int temperature) {
        super(name, cost, 100);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }





    
}
