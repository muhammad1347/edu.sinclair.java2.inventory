package edu.sinclair.java2.inventory;

public class ServicePromotion implements CatalogEntry {

	private String text;
	
	public ServicePromotion(String text) {
		this.text = text;
	}
	
	@Override
	public String getCatalogText() {
		return this.text;
	}

}
