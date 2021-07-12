package org.enchere.bll;

public class ArticleVenduManager {
    
    private static ArticleVenduManager instance = null;

    private ArticleVenduManager() {
	super();
    }

    @SuppressWarnings("unused")
    private static ArticleVenduManager getArticleVenduManager() {

	if(ArticleVenduManager.instance == null)
	    ArticleVenduManager.instance = new ArticleVenduManager();
	return ArticleVenduManager.instance;

    }
}
