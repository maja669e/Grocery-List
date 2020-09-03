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
        for(GroceryItemOrder order : orders){
            result += order;
        }
        return result;
    }
}
