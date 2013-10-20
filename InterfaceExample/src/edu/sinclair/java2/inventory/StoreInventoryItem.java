package edu.sinclair.java2.inventory;

public class StoreInventoryItem extends StockedInventoryItem implements CatalogEntry {

	private String catalogText;
	
	public StoreInventoryItem(String sku, int up, String catalogText) {
		super(sku, up);
		this.catalogText = catalogText;
	}
	
	@Override
	public String getCatalogText() {
		return this.catalogText;
	}

	@Override
	public void sell(String custId, int quantity) {
		tallySold(quantity);
		// do store-specific sell procedures - assess cost, tax,
		//   store in database...
	}

}
