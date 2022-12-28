package flowcontrol;
import java.util.Scanner;
public class ProductInformation {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter product id:");
	int pid=obj.nextInt();
	System.out.println("Enter product name:");
	String pname=obj.next();
	System.out.println("Enter product category:");
	String category=obj.next();
	System.out.println("Enter product price:");
	int price=obj.nextInt();
	System.out.println("Enter product quantity:");
	int quantity=obj.nextInt();
	System.out.println("Enter product brand:");
	String brand=obj.next();

	System.out.println("Product id:" +pid);
	System.out.println("Product name:" +pname);
	System.out.println("Product category:" +category);
	System.out.println("Product price:"+price);
	System.out.println("Product quantity:" +quantity);
	System.out.println("Product brand:" +brand);
	}
}