import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater("qwe", 123, 100));
        productList.add(new BottleOfWater("ads", 300, 150));
        productList.add(new BottleOfWater("fsg", 124, 160));
        productList.add(new BottleOfWater("qwet", 122, 170));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        
        vendingMachine.initProducts(productList);
        System.out.println(vendingMachine.getProduct("qwe"));

        System.out.println("---------------------------------");

        productList.add(new HotDrink("abc", 20, 150, 5));
        productList.add(new HotDrink("bcd", 11, 150, 6));
        productList.add(new HotDrink("cde", 12, 150, 6));
        productList.add(new HotDrink("def", 13, 150, 5));

        HotOfDrinkVengingMachine vendingMachine1 = new HotOfDrinkVengingMachine();
        vendingMachine1.initProducts(productList);
        System.out.println(vendingMachine.getProduct("abc"));

    }
    
}
