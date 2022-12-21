package purchase_details;

import java.util.Scanner;

public class CalculateBudget 
{
	public static void main(String[] args) 
	{
		int quantity;
		String Product_Name;
		double price, amount, Discounted_amount, discount;
		Scanner scan = new Scanner(System.in);
		System.out.print("Product Name: ");
		Product_Name = scan.nextLine();
		System.out.print("Enter the quantity of the product: ");
		quantity = scan.nextInt();
		System.out.print("Enter the price of a quantity: ");
		price = scan.nextDouble();
		amount = quantity * price;
		if(amount>=5000)
		{
			discount = amount * 0.1;           //10% discount
			Discounted_amount = amount - discount;            // discounted price
			System.out.println("The total price of the product is: " +amount);
			System.out.println("The total price of the product after discount is: " +Discounted_amount);
		}
		else
		{
			System.out.println("The total price of the product is: " +amount);
		}
	}
}