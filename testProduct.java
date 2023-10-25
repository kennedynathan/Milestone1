public class testProduct {
public static void main(String[] args) {
    StoreFront store = new StoreFront();
    SalableProduct ball = new SalableProduct("ball","baseball",5.00,20);
    store.getInventoryManager().addProduct(ball);

    // Purchase a product called "ball"
    store.purchaseProduct("ball");

    // Display shopping cart total
    System.out.println("Total Price: $" + store.getShoppingCart().getTotalPrice());
}
}