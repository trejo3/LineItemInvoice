public class LineItem 
{
	private int qty, invoiceNum;
	private String itemDesc;
	private double itemPrice;
	
	
	public int getQty(){
		return qty;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	
	LineItem (int newQty, String newItemDesc, double newItemPrice, int newInvoiceNum)
	{
		qty = newQty;
		itemDesc = newItemDesc;
		itemPrice = newItemPrice;
		invoiceNum = newInvoiceNum;
	}
	
}
