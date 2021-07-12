package org.enchere.bll;

public class EnchereManager {

    private static EnchereManager instance = null;
    
    private EnchereManager() {
	super();
    }
    
    private static EnchereManager getEnchereManager() {
	
	if(EnchereManager.instance == null)
	    EnchereManager.instance = new EnchereManager();
	return EnchereManager.instance;
	
    }
}
