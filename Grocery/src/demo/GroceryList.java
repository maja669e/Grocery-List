package demo;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> orders = new ArrayList<>();
    private int index = 0;

    public void add(GroceryItemOrder item) {
        if (index >= 10) {
            return;
        }
        orders.add(item);
        index++;
    }

    public double getTotalCost() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getCost();
        }
        return sum;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < index; i++) {
            result += orders.get(i) + "\n";
        }
        result += "Total cost: " + getTotalCost() + "$";
        return result;
    }
}
