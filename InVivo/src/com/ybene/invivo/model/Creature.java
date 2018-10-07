package com.ybene.invivo.model;

/**
 * Class to manage player's creature
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 7th of October 2018
 */

public class Creature {

	// ===== Basic elements =====
	private String creatureName;
	private Clade creatureType;
	
	// ===== Constructors =====
	public Creature() {
		this.creatureName = null;
		this.creatureType = Clade.MAMMAL;
	}
	
	// ===== Getters and setter =====
	public String getCreatureName() {
		return creatureName;
	}
	
	public Clade getCreatureType() {
		return creatureType;
	}
}
