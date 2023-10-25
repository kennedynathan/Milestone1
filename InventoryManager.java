import java.util.ArrayList;
import java.util.List;

class InventoryManager {
	    private List<SalableProduct> products;

	    public InventoryManager() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(SalableProduct product) {
	        products.add(product);
	    }

	    public void removeProduct(SalableProduct product) {
	        products.remove(product);
	    }

	    public SalableProduct findProduct(String name) {
	        for (SalableProduct product : products) {
	            if (product.getName().equalsIgnoreCase(name)) {
	                return product;
	            }
	        }
	        return null;
	    }
	}
