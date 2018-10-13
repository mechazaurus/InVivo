package com.ybene.invivo.model.beast;

/**
 * Class to define a creature
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 7th of October 2018
 */

public class Creature {

	// ===== Basic elements =====
	private String creatureName;
	private Species creatureType;
	
	// ===== Constructors =====
	public Creature() {
		this.creatureName = null;
		this.creatureType = null;
	}
	
	// ===== Getters and setters =====
	public String getCreatureName() {
		return this.creatureName;
	}
	
	public Species getCreatureType() {
		return this.creatureType;
	}
}
