import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine {
    private List<HotDrink> drinks;

    public HotDrinksMachine() {
        super();
    }

    public HotDrinksMachine(List<HotDrink> drinks) {
        this.drinks = drinks;
    }

    public void addDrinks(HotDrink name){
        if (drinks == null) {
            drinks = new ArrayList<HotDrink>();
            }
        this.drinks.add(name);
    }
    

    public HotDrink getHotDrink(String name, int volume) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        throw new IllegalStateException(String.format("Не найдено напитка с названием %s и объемом %d", name, volume));
    }
    public HotDrink getHotDrink(String name, int volume, int temperature) {
            for (HotDrink drink : drinks) {
            if (drink.getName().equalsIgnoreCase(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                drinks.remove(drink);
                return drink;
            }
        }
        throw new IllegalStateException(String.format("Не найдено напитка с названием %s, объемом %d и температурой %d", name, volume, temperature));
    }

    public String toString() {
        return "HotDrinksMachine{" +
               "drinks=" + drinks +
               '}';
    }


}