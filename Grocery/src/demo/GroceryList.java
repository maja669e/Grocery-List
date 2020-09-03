package demo;
import GroceryOrderItem;

public class GroceryList {
    private GroceryOrderItem[] orders = new GroceryOrderItem[10];

    public void add(GroceryOrderItem item){
        if(orders.length() >= 10){
            return;
        }
        orders.add(item);
    }

    public String toString(){
        String result = "";
        for(GroceryOrderItem order : orders){
            result += order;
        }
        return result;
    }
}
