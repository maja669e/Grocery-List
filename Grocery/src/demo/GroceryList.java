package demo;

public class GroceryList {
    private GroceryItemOrder[] orders = new GroceryItemOrder[10];
    private int index = 0;

    public void add(GroceryItemOrder item) {
        if (index >= 10) {
            return;
        }
        orders[index] = item;
        index++;
    }

    public double getTotalCost() {
        int sum = 0;
        for (int i = 0; i < orders.length; i++) {
            sum = sum + orders[i].getCost();
        }
        return sum;
    }

    public String toString() {
        String result = "";
        for(int i = 0; i < index; i++){
            result += orders[i] + "\n";
        }
        result += "Total cost: " + getTotalCost() + "$";
        return result;
    }
}
