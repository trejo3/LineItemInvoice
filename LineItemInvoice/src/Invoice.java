import java.util.Date;
import java.util.ArrayList;

public class Invoice 
{
	private String customerName;
	private double total;
	private int invoiceNumber;
	private Date date;
	ArrayList<LineItem> LineItems = new ArrayList<LineItem>();


	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	public Invoice(String newCustomerName, double newTotal, int newInvoiceNumber, Date newDate)
	{
		customerName = newCustomerName;
		total = newTotal;
		invoiceNumber = newInvoiceNumber;
		date = newDate;
	}

	
	
	
	public void addLineItem(LineItem Line)
	{
		LineItems.add(Line);
	}

	
	
	
	public double calculateSubtotal()
	{
		double subtotal = 0.0;
		
		for(int i = 0; i < LineItems.size(); i++)
		{
			double price = LineItems.get(i).getItemPrice();
			int quant = LineItems.get(i).getQty();
			
			subtotal += (price * quant);
		}
		
		return subtotal;
	}
	
	
	public double calculateTax(double taxRate)
	{
		return (calculateSubtotal() * taxRate);
	}
	
	public double calculateGrandTotal(double taxRate)
	{
		return (calculateSubtotal() + calculateTax(taxRate));
	}
	
	public void getLineItem()
	{
		for(int i = 0; i < LineItems.size(); i++)
		{
			System.out.println(LineItems.get(i));
		}
	}

}
