package demo;

public class GroceryList {
    private GroceryItemOrder[] orders = new GroceryItemOrder[10];
    private int index = 0;

    public void add(GroceryItemOrder item){
        if(index >= 10){
            return;
        }
        orders[index] = item;
        index++;
    }

    public String toString(){
        String result = "";
        double grandTotal = 0;
        for(int i = 0; i < index; i++){
            result += orders[i] + "\n";
            grandTotal += orders[i].getCost();
        }
        result += "Grand total: " + grandTotal + "$";
        return result;
    }
}
