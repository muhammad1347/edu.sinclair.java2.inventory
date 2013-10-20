package edu.sinclair.java2.inventory;

public class UnstockedInventoryItem extends InventoryItem {

	// @todo implement vendor operations
	// private ArrayList<String> vendorList;
	
	protected UnstockedInventoryItem(String sku, int up) {
		super(sku, up);
	}
	
	@Override
	public void sell(String custId, int quantity) {
		tallySold(quantity);
		// place order with external vendor, arrange shipping, etc.
	}
	
}
