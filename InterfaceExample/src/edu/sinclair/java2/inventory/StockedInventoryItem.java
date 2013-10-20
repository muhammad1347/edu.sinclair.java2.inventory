package edu.sinclair.java2.inventory;

import java.util.ArrayList;

public abstract class StockedInventoryItem extends InventoryItem {

	private ArrayList<String> stockLocations = new ArrayList<>();
	
	protected StockedInventoryItem(String sku, int up) {
		super(sku, up);
	}
	
	public String[] getStockLocations() {
		return (String[])this.stockLocations.toArray();
	}
	
	public void addStockLocation(String locationId) {
		this.stockLocations.add(locationId);
	}
}
