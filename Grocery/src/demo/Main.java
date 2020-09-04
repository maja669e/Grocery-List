package demo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GroceryItemOrderFileHandler fileHandler = new GroceryItemOrderFileHandler();
        ArrayList<ItemOrder> itemOrders = fileHandler.scanGroceryItemOrdersFromFile();
        GroceryList groceryList = new GroceryList();
        for(ItemOrder order : itemOrders){
            groceryList.add(order);
        }
//        GroceryItemOrder mælk = new GroceryItemOrder("Arla", 2, 5);
//        GroceryItemOrder kage = new GroceryItemOrder("Chokolade", 1, 10);
//        GroceryItemOrder sukker = new GroceryItemOrder("Sukker", 1, 15);
//        GroceryItemOrder ost = new GroceryItemOrder("Gouda", 3, 18);
//        GroceryItemOrder kartofler = new GroceryItemOrder("Danske kartofler", 1, 7);
//        GroceryItemOrder peber = new GroceryItemOrder("Sort peber", 1, 5);
//        GroceryItemOrder vodka = new GroceryItemOrder("Slavevodka", 1, 60);
//        GroceryItemOrder nudler= new GroceryItemOrder("Karrynudler fra Netto", 5, 2);
//        GroceryItemOrder chokolade = new GroceryItemOrder("Marabou", 2, 20);
//        GroceryItemOrder chips = new GroceryItemOrder("Dild", 1, 18);
        //GroceryItemOrder chips2 = new GroceryItemOrder("Dild2", 1, 18);
//        groceryList.add(mælk);
//        groceryList.add(kage);
//        groceryList.add(sukker);
//        groceryList.add(ost);
//        groceryList.add(kartofler);
//        groceryList.add(peber);
//        groceryList.add(vodka);
//        groceryList.add(nudler);
//        groceryList.add(chokolade);
//        groceryList.add(chips);
        //groceryList.add(chips2);
        System.out.println(groceryList);
    }
}
