package com.ybene.invivo.model;

import com.ybene.invivo.model.beast.Creature;
import com.ybene.invivo.model.items.Inventory;

/**
 * Class to manage player's creature
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

public class Player extends Creature {

	// ===== Basic elements =====
	private String playerName;
	private Inventory playerInventory;
	
	// ===== Constructors =====
	public Player() {	
		super();
		playerName = null;
		playerInventory = new Inventory();
	}
	
	// ===== Getters and setters =====
	public String getPlayerName() {
		return this.playerName;
	}
	
	public Inventory getPlayerIventory() {
		return this.playerInventory;
	}
}
