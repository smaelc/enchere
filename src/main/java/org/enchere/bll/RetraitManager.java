package org.enchere.bll;

public class RetraitManager {

    private static RetraitManager instance = null;

    private RetraitManager() {
	super();
    }

    private static RetraitManager getRetraitManager() {

	if(RetraitManager.instance == null)
	    RetraitManager.instance = new RetraitManager();
	return RetraitManager.instance;

    }
}
