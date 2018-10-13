package com.ybene.invivo.model.items;

/**
 * Class to management inventory related errors
 * @author Yohann BENETREAULT
 * @version 0.0a
 * 
 * Created on the 13th of October 2018
 */

public class InventoryManagementException extends Exception {

	// ===== Basic elements =====
	private static final long serialVersionUID = 1L;
	
	// ===== Constructors =====
	public InventoryManagementException() {
		super();
	}
	
	public InventoryManagementException(String msg) {
		super(msg);
	}
}
