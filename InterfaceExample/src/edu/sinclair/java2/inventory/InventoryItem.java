package edu.sinclair.java2.inventory;

public abstract class InventoryItem {

	private String sku;
	private int unitPrice;
	private int quantitySold;
	
	public int getQuantitySold() {
		return quantitySold;
	}

	protected InventoryItem(String sku, int up) {
		this.sku = sku;
		this.unitPrice = up;
	}

	public abstract void sell(String custId, int quantity);
	
	protected void tallySold(int quantity) {
		System.out.println("Sold " + quantity + " " + this.sku);
		this.quantitySold += quantity;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getSku() {
		return sku;
	}
	
}
