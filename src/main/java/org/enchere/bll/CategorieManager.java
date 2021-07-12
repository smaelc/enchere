package org.enchere.bll;

public class CategorieManager {
    
    private static CategorieManager instance = null;
    
    private CategorieManager() {
	super();
    }
    
    @SuppressWarnings("unused")
    private static CategorieManager getCategorieManager() {
	
	if(CategorieManager.instance == null)
	    CategorieManager.instance = new CategorieManager();
	return CategorieManager.instance;
	
    }

}
