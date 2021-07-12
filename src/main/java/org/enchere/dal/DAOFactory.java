package org.enchere.dal;


public class DAOFactory {
    
    @SuppressWarnings("unused")
    private static DAOFactory instance = null;
    
    static {
	instance = new DAOFactory();
    }

    private DAOFactory() {
	super();
    }

    /**
     * Obtenir un DAO par un factory.
     * @param name
     * @return
     */
    public static Object getDAO( String name) {
	
	if(name == null)
	    return null;

	if("ARTICLEVENDU" == name.toUpperCase())
	    return new ArticleVenduDAO();

	if("ENCHERE" == name.toUpperCase())
	    return new EnchereDAO();

	if("CATEGORIE" == name.toUpperCase())
	    return new CategorieDAO();

	if("RETRAIT" == name.toUpperCase())
	    return new RetraitDAO();

	if("UTILISATEUR" == name.toUpperCase())
	    return new UtilisateurDAO();

	return null;
    }

}
