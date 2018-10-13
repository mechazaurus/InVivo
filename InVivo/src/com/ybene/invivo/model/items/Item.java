package com.ybene.invivo.model.items;

/**
 * Class to create an inventory's slot
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

public class Item {

	// ===== Basic elements =====
	private String itemName;
	
	// ===== Constructors =====
	public Item() {
		this.itemName = null;
	}
	
	public Item(String name) {
		this.itemName = name;
	}
	
	// ===== Getters and setters =====
	public String getItemName() {
		return this.itemName;
	}
}
