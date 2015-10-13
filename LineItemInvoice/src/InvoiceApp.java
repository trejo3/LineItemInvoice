import java.util.Scanner;
import java.util.Date;

public class InvoiceApp 
{
	private static String newCustomerName;
	private static int newQty;
	private static String newItemDesc;
	private static double newItemPrice;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int newInvoiceNum = 0;
		double newTotal = 0.0;
		double subtotal = 0.0;
		double tax = 0.2;
		double taxAmt = 0.0;
		Date newDate = new Date();
		int lineItem = 1;
		String cont = " ";
		
		System.out.println("Enter invoice number: ");
		newInvoiceNum = keyboard.nextInt();
		
		
		do
		{
			newInvoiceNum ++;
			
			System.out.println("Enter Customer Name: ");
			newCustomerName = keyboard.next();
			
			Invoice newInvoice = new Invoice(newCustomerName, newTotal, newInvoiceNum, newDate);
			
			do
			{				
				System.out.println(" ");
				System.out.println("Line Item: " + lineItem);
				System.out.println("----------");
				System.out.println(" ");
					
				System.out.println("Enter quantity:");
				newQty = keyboard.nextInt();
				
				System.out.println("Enter item description: ");
				newItemDesc = keyboard.next();
				
				System.out.println("Enter unit price: ");
				newItemPrice = keyboard.nextDouble();
				
				System.out.println("More items?: ");
				cont = keyboard.next();
				
				lineItem++;
			
				LineItem newLine = new LineItem(newQty, newItemDesc, newItemPrice, newInvoiceNum);
				
				newInvoice.addLineItem(newLine);
			
			}while (cont.equals("yes"));
		
			System.out.println("");
			System.out.println("");
			
			System.out.println("Your receipt: ");
			System.out.println("===============");
			System.out.println("");
			
			
			newInvoice.getLineItem();
			
			System.out.println("");
			System.out.println("===============");
		
			System.out.println("Subtotal: " + newInvoice.calculateSubtotal());
		
			System.out.println("Enter tax rate: ");
			double taxRate = keyboard.nextDouble();
		
			System.out.println("Tax: "+ newInvoice.calculateTax(taxRate));
		
			System.out.println("Grand Total: " + newInvoice.calculateGrandTotal(taxRate));
		
		}while (cont.equals("yes"));
			
		
		keyboard.close();
	}
}
