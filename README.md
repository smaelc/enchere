# Projet Java EE, école ENI 




To Do
-----------------------------

* email : comment stocker les identifiants dans context.xml ? 


Question sur le projet 
--------------------------------

* exigence 6002 : page de connexion ou liste des enchères pour welcome page ?


Base de données
------------------------------------------------

* ajouter un champ utilisateur.actif pour répondre à l'exigence 3002 
* ajouter un champ article.enchere_id ?
* pas de contrainte unique sur PSEUDO et email ? 
* PRIMARY KEY (no_utilisateur, no_article) empêche un acheteur d'enchérir 2 fois sur un même article !
* il serait plus logique de créer un champ article.retrait plutôt que retrait.no_article car un article peut ne pas avoir de point de retrait si BLL mal gérée !
* création d'un champ utilisateur.adresse plutôt que de répéter les 3 champs rue, adresse, ville. Cela est plus rapide à recopier comme "adresse par défaut"
* ARTICLES_VENDUS.no_utilisateur pourrait être renommé en article.vendeur_id (nom de table, nom de champ et suffixe_id) 
* rajouter un champ article.acheteur pourrait être intéressant 


Infos
------------------------------------

* Spring permettra de passer des paramètres dans l'url du  @webservlet /article/{id} avec  @Postvariable
* Ne pas définir une @WebServlet("/") qui intercepterait toute les routes du genre /logo.png. La Webservlet accueil doit avoir une url /accueil. Pour géréer une requête racine, il faut définir welcome-file dans web.xml 
* JPA permettra de vérifier cohérence base de données et Objets BO 
* liens brisés possibles car les liens du genre < a href="getPath('servlet_name')"> ou redirectToRoute('servlet_name') n'est pas gérable
* les fragments JSP doivent rester cohérents (balises ouvrantes / fermantes). Séparer header du nav pour avoir la balise BODY dans le JSP.... 
* bibliotheque log4J pour faire un log d'activité 
* rs.getMetaData().getColumnName() pour avoir le nb de caracteres d'un varchar de bdd et mettre un maxlength dans le formulaire 



Tomcat recopie le contenu de webapp au démarrage. 

L'upload des images se fait alors dans le répertoire réel suivant :

eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Encheres/images

Pour log4j, catalina.base écrit dans 

eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/

