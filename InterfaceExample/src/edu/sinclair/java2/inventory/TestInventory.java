package edu.sinclair.java2.inventory;

import java.util.ArrayList;

public class TestInventory {

	public static void main(String[] args) {
		ArrayList<InventoryItem> invItems = new ArrayList<>();

		StoreInventoryItem storeinvItem;
		
		storeinvItem = new StoreInventoryItem("123", 245, "Strident X300 LawnMower");
		storeinvItem.addStockLocation("888-42");
		storeinvItem.addStockLocation("634-33");
		invItems.add(storeinvItem);
		
		storeinvItem = new StoreInventoryItem("789", 111, "LawnMaster SeedTurbo");
		storeinvItem.addStockLocation("634-33");
		invItems.add(storeinvItem);

		storeinvItem = new StoreInventoryItem("456", 45, "Strident R4 EdgeTrimmer");
		storeinvItem.addStockLocation("888-42");
		storeinvItem.addStockLocation("799-77");
		invItems.add(storeinvItem);
		
		WarehouseInventoryItem wareinvItem;
		
		wareinvItem = new WarehouseInventoryItem("w443", 88);
		wareinvItem.addStockLocation("634-33");
		invItems.add(wareinvItem);
		
		UnstockedInventoryItem unstinvItem;
		unstinvItem = new UnstockedInventoryItem("u543", 1200);
		//unstinvItem.setVendor
		invItems.add(unstinvItem);
		
		System.out.println("Selling one of each item:");
		for (InventoryItem invItem : invItems)
			invItem.sell("c234", 1);
		
		// make catalog
		ArrayList<CatalogEntry> catEntries = new ArrayList<>();
		for (InventoryItem invItem : invItems)
			if (invItem instanceof CatalogEntry)
				catEntries.add((CatalogEntry)invItem);
		catEntries.add(new ServicePromotion("Call our service team!"));
		
		System.out.println("\nCatalog:");
		for (CatalogEntry ce : catEntries)
			System.out.println(ce.getCatalogText());
	}
			
}
