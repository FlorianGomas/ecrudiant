# ecrudiant

Cette API permet d'accéder au CRUD (Create, Read, Delete, Update) de l'annuaire des étudiants de DAGPI de la promotion 2021-2022.

Nous l'avons développé en Java avec l'utilisation du framework Spring, parfaitement adapté au développement d'API REST

## Utilisation de l'API:

### Récupérer la liste de tout les étudiants 

* GET (*/ecrudiant/rest/students*)

Code de retour : 200

*Format de la réponse* :

![image-20220519173401652](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519173401652.png)

### Afficher le détail d'un étudiant 

* GET (*ecrudiant/rest/students/{id}*)

Code de retour : 200

*Format de la réponse* :

![image-20220519174113838](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519174113838.png)

### Ajouter un étudiant 

* POST (*/ecrudiant/rest/students* avec les informations dans le body)

  ![image-20220519174240157](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519174240157.png)

Code de retour : 201

*Format de la réponse* :

![image-20220519174300876](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519174300876.png)



### Modifier un étudiant 

* PUT (*/ecrudiant/rest/students/{id}* avec les informations dans le body)

![image-20220519174446597](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519174446597.png)

Code de retour : 201

*Format de la réponse* :

![image-20220519174502441](C:\Users\fgomas\AppData\Roaming\Typora\typora-user-images\image-20220519174502441.png)

### Supprimer un étudiant 

* DELETE (*/ecrudiant/rest/students/{id})*

Code de retour : 204
