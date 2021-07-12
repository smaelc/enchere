package org.enchere.dal;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;


 abstract class DAO <T extends Serializable> {

    /**
     * Obtenir un élément T par son id
     * @param idElement
     * @return
     */
    public abstract T getElementById(int idElement);


    /**
     * Obtenir l'ensemble des éléments
     * @return
     */
    public abstract List<T> getElements();

    /**
     * Insére un élément dans la base et renvoie son instance 
     * @param elementId
     * @return
     */
    public abstract T insert(T elementId)  throws SQLException;


    /**
     * Mettre à jour un élément
     * @param elementId
     */
    public abstract void update (T elementId)  throws SQLException;


    /**
     * Supprimer physiquement un élément
     * @param elementId
     */
    public abstract void delete (T elementId)  throws SQLException;

}
