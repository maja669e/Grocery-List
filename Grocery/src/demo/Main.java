package demo;

public class Main {

    public static void main(String[] args) {
        GroceryList groceries = new GroceryList();
        groceries.add(new GroceryItemOrder("Milk", 2, 10));
        groceries.add(new GroceryItemOrder("Cheese", 4, 30));
        groceries.add(new GroceryItemOrder("Apples", 7, 5));
        groceries.add(new GroceryItemOrder("Canned Tomatoes", 1, 4));
        System.out.println(groceries);

    }
}
