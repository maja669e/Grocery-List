package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryItemOrderFileHandler {
    File file = new File("groceries.txt");

    public ArrayList<ItemOrder> scanGroceryItemOrdersFromFile(){
        ArrayList<ItemOrder> itemOrders = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            String name;
            int quantity;
            int price;
            while(scan.hasNext()){
                name = scan.next().replace("-", " ");
                quantity = scan.nextInt();
                price = scan.nextInt();

                itemOrders.add(new ItemOrder(name, quantity, price));
//                scan.nextLine();

            }
            return itemOrders;
        } catch (FileNotFoundException e) {
            System.out.println("The file Not found!");

        }
        return itemOrders;
    }
}
