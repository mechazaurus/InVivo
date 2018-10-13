package com.ybene.invivo.model.items;

/**
 * Class to create an inventory (player's or chest's)
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

public class Inventory {

	// ===== Basic elements =====
	private static Integer newInventoryID = 1;
	private Integer inventoryID;
	private Integer inventorySize;
	private Slot[] slots;
	
	// ===== Constructors =====
	public Inventory() {
		this.inventoryID = newInventoryID;
		this.inventorySize = 6; // Default capacity
		this.slots = new Slot[inventorySize];
		
		inventorySlotsSetup();
		
		newInventoryID++;
	}
	
	public Inventory(Integer size) {
		this.inventoryID = newInventoryID;
		this.inventorySize = size;
		this.slots = new Slot[inventorySize];
		
		inventorySlotsSetup();
		
		newInventoryID++;
	}
	
	// ===== Getters and setters =====
	public Integer getInvetoryID() {
		return this.inventoryID;
	}
	
	public Integer getInventorySize() {
		return this.inventorySize;
	}
	
	public void setIventorySize(Integer size) {
		this.inventorySize = size;
	}
	
	public Slot[] getInventorySlots() {
		return this.slots;
	}
	
	// ===== Other methods =====
	private void inventorySlotsSetup() {	
		for (Integer index = 0 ; index < inventorySize ; index++) {
			slots[index] = new Slot(this, index + 1);
		}
	}
}
