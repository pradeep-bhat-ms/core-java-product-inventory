package core_java_product_inventory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class ProductService {
	    // HashMap
	    HashMap<Integer, Product> products =new HashMap<>();

	    // Add Product
	    public void addProduct(Product product) {

	        products.put( product.getId(),product);

	        System.out.println( "Product Added Successfully");
	    }

	    // View Products
	    public void viewProducts() {

	        if(products.isEmpty()) {

	            System.out.println("No Products Available");
	            return;
	        }

	        for(Product p : products.values()) {
	            p.display();
	        }
	    }

	    // Search Product
	    public void searchProduct(int id) {

	        Product p = products.get(id);

	        if(p != null) {
	            p.display();
	        }
	        else {
	            System.out.println( "Product Not Found");
	        }
	    }

	    // Delete Product
	    public void deleteProduct(int id) {
	        if(products.containsKey(id)) {
	            products.remove(id);
	            System.out.println( "Product Deleted Successfully");
	        }
	        else {
	            System.out.println("Product Not Found");
	        }
	    }

	    // Sort By Price
	    public void sortByPrice() {
	        ArrayList<Product> list =
	                new ArrayList<>(products.values());

	        Collections.sort(list,new Comparator<Product>() {

	            @Override
	            public int compare(Product p1,Product p2) {

	                return Double.compare(p1.getPrice(),p2.getPrice());
	            }
	        });

	        System.out.println("\n--- Products Sorted By Price ---");
	        for(Product p : list) {
	            p.display();
	        }
	    }
	}

