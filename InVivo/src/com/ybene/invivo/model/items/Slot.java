package com.ybene.invivo.model.items;

/**
 * Class to create an inventory's slot
 * A slot will contain one item
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

public class Slot {

	// ===== Basic elements =====
	private Inventory slotInventory;
	private Integer slotNumber;
	private Item slotItem;
	
	// ===== Constructors =====
	public Slot() {
		this.slotInventory = null;
		this.slotNumber = null;
		this.slotItem = null;
	}
	
	public Slot(Inventory inventory, Integer number) {
		this.slotInventory = inventory;
		this.slotNumber = number;
		this.slotItem = null;
	}
	
	// ===== Getters and setter =====
	public Inventory getSlotInventory() {
		return this.slotInventory;
	}
	
	public Integer getSlotNumber() {
		return this.slotNumber;
	}
	
	public Item getSlotItem() {
		return slotItem;
	}
	
	// ===== Other methods =====
	public void addItemToSlot(Item item) throws InventoryManagementException {
		if (slotItem != null) {
			throw new InventoryManagementException("Le slot est déjà occupé...");
		} else {
			this.slotItem = item;
		}
	}
	
	public void removeItemFromSlot() {
		this.slotItem = null;
	}
}
