package core_java_product_inventory;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ProductService service =new ProductService();

	        while(true) {
	            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");

	            System.out.println("1. Add Product");
	            System.out.println("2. View Products");
	            System.out.println("3. Search Product");
	            System.out.println("4. Delete Product");
	            System.out.println( "5. Sort Products By Price");
	            System.out.println( "6. Exit");
	            System.out.print("Enter Choice : ");

	            int choice = sc.nextInt();
	            switch(choice) {
	            
	                case 1:
	                    System.out.print("Enter Product ID : ");
	                    int id = sc.nextInt();
	                    sc.nextLine();
	                    System.out.print("Enter Product Name : ");
	                    String name =sc.nextLine();

	                    System.out.print("Enter Product Price : ");

	                    double price =sc.nextDouble();
	                    Product p =new Product(id,name,price);
	                    service.addProduct(p);
	                    break;

	                case 2:
	                    service.viewProducts();
	                    break;

	                case 3:
	                    System.out.print("Enter Product ID : ");
	                    int searchId =sc.nextInt();
	                    service.searchProduct(searchId);
	                    break;

	                case 4:
	                    System.out.print( "Enter Product ID : ");
	                    int deleteId =sc.nextInt();
	                    service.deleteProduct(deleteId);
	                    break;

	                case 5:
	                    service.sortByPrice();
	                    break;

	                case 6:
	                    System.out.println("Thank You");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        }
	    }
	}

