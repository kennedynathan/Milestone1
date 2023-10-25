class StoreFront {
	 private InventoryManager inventoryManager;
	 private ShoppingCart shoppingCart;

	 public StoreFront() {
	     inventoryManager = new InventoryManager();
	     shoppingCart = new ShoppingCart();
	 }

	 public void initializeStore() {
	     //initial products = 0
	    }

	 public void purchaseProduct(String productName) {
	     SalableProduct product = inventoryManager.findProduct(productName);

	     if (product != null && product.getQuantity() > 0) {
	         shoppingCart.addItem(product);
	         product.quantity--;
	         System.out.println("Purchased " + product.getName());
	     } else {
	         System.out.println("Product not available.");
	     }
	 }

	 public void cancelPurchase(String productName) {
	     SalableProduct product = inventoryManager.findProduct(productName);

	     if (product != null && shoppingCart.getTotalPrice() > 0) {
	         shoppingCart.removeItem(product);           
	         product.quantity++;
	         System.out.println("Cancelled purchase of " + product.getName());
	     } else {
	         System.out.println("Nothing to cancel.");
	     }
	 }

	 public InventoryManager getInventoryManager() {
	     return inventoryManager;
	 }

	 public ShoppingCart getShoppingCart() {
	     return shoppingCart;
	 }
}