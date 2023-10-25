import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	 private List<SalableProduct> items;

	    public ShoppingCart() {
	        items = new ArrayList<>() ;
	    }

	    public void addItem(SalableProduct product) {
	       items.add(product);
	    }

	    public void removeItem(SalableProduct product) {
	        items.remove(product);
	    }

	    public double getTotalPrice() {
	        double totalPrice = 0.00;
	        for (SalableProduct product : items) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }
	}


