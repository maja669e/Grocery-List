package demo;

public class ItemOrder {
    GroceryProduct groceryProduct;
    private int quantity;

    public ItemOrder(String name, int quantity, int price){
        this.groceryProduct = new GroceryProduct(price, name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public int getCost() {
        return groceryProduct.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return "Name: " + groceryProduct.getName() + ", quantity: " + quantity + ", total price: " + getCost() + "$";
    }
}
