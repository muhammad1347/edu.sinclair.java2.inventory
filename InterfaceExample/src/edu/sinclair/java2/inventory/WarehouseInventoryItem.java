package edu.sinclair.java2.inventory;

public class WarehouseInventoryItem extends StockedInventoryItem {

	public WarehouseInventoryItem(String sku, int up) {
		super(sku, up);
	}
	
	@Override
	public void sell(String custId, int quantity) {
		tallySold(quantity);
		// do warehouse-specific sell procedures - assess cost, tax,
		//   store in database, set up shipping, add to warehouse
		//   queue for processing, etc.
	}

}
