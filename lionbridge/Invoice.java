package com.lionbridge;

public class Invoice {
	String partNumber;
	String description;
	int quantity;
	double price;
	
	public Invoice (String pnumber,String desc,int quan, double priceper  )
	{
		partNumber = pnumber;
		description = desc;
		quantity = quan;
		price = priceper;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if (quantity<0);
		quantity = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if (price <0);
		price = 0.0;
	}
	public double getInvoiceAmount() {
		return quantity*price;
		
	}
	public static void main(String [] args) {
	Invoice invoice1 = new Invoice ("12","Raspberry",2,18);
	Invoice invoice2 = new Invoice("46","Arduino",6,0);
	
	System.out.println(" Invoice for Raspberry");
	
	System.out.println(invoice1.getPartNumber()+ " " + invoice1.getDescription()+" " +invoice1.getQuantity()+ " "  +invoice1.getPrice()+" " +invoice1.getInvoiceAmount());
    System.out.println(" Invoice for Arduino");
	System.out.println(invoice2.getPartNumber()+ " " + invoice2.getDescription()+ " " +invoice2.getQuantity()+ " " +invoice2.getPrice()+ " "+invoice2.getInvoiceAmount());
	}
	
	

}
