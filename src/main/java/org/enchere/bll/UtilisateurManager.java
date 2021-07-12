package org.enchere.bll;

public class UtilisateurManager {

private static UtilisateurManager instance = null;
    
    private UtilisateurManager() {
	super();
    }
    
    private static UtilisateurManager getUtilisateurManager() {
	
	if(UtilisateurManager.instance == null)
	    UtilisateurManager.instance = new UtilisateurManager();
	return UtilisateurManager.instance;
	
    }
}
