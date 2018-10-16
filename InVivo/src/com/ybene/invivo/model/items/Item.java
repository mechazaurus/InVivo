package com.ybene.invivo.model.items;

/**
 * Class to create an inventory's slot
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

abstract class Item {

	// ===== Basic elements =====
	private static Integer newItemID;
	private Integer itemID;
	private Slot itemSlot;
	private String itemName;
	private ItemRarity itemRarity;
	private Integer itemValue;
	private String itemDescription;
	
	// ===== Constructors =====
	public Item() {
		this.itemID = newItemID;
		
		newItemID++;
	}
	
	public Item(String name, ItemRarity rarity, Integer value) {
		this.itemID = newItemID;
		this.itemName = name;
		this.itemRarity = rarity;
		this.itemValue = value;
		
		newItemID++;
	}
	
	// ===== Getters and setters =====
	public Integer getItemID() {
		return this.itemID;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public Slot getItemSlot() {
		return this.itemSlot;
	}
	
	public void setItemSlot(Slot slot) {
		this.itemSlot = slot;
	}
	
	public ItemRarity getItemRarity() {
		return this.itemRarity;
	}
	
	public void setItemRarity(ItemRarity rarity) {
		this.itemRarity = rarity;
	}
	
	public Integer getItemValue() {
		return this.itemValue;
	}
	
	public String getItemDescription() {
		return this.itemDescription;
	}
	
	public void setItemDescription(String description) {
		this.itemDescription = description;
	}
}
