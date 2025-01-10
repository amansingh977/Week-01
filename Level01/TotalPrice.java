import java.util.*;
class TotalPrice {
	public static void main(String args[]) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// unit price of a product
		int unitPrice = sc.nextInt();

		//	number of quatity	
		int quantity = sc.nextInt();
		
		// Calculate total purchase
		int totalPurchase = unitPrice * quantity;
		
		// Display result
		System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity "+ quantity + " and unit price is INR " + unitPrice);
		
		// Scanner class closed
		sc.close();
		
	}
}
