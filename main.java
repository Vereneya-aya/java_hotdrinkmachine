public static void main(String[] args) {

    CoffeeAmericano coffee1 = new CoffeeAmericano();
    coffee1.setName("Coffee1");
    coffee1.setTemperature(100);
    coffee1.setCost(10);
    coffee1.setVolume(100);
    System.out.println(coffee1.toString());

    HotDrink tea1 = new HotDrink();
    tea1.setName("Tea1");
    tea1.setCost(10);
    System.out.println(tea1.toString());

    HotDrink tea2 = new HotDrink();
    tea2.setName("Tea2");
    tea2.setCost(10);
    System.out.println(tea2.toString());

    HotDrinksMachine HDM1 = new HotDrinksMachine();
    HDM1.addDrinks(coffee1);
    HDM1.addDrinks(tea1);
    HDM1.addDrinks(tea2);
    System.out.println(HDM1);
    HDM1.getHotDrink("Coffee1", 100, 100);
    System.out.println(HDM1);

 
}