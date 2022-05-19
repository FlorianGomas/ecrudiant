# ecrudiant

Cette API permet d'accéder au CRUD (Create, Read, Delete, Update) de l'annuaire des étudiants de DAGPI de la promotion 2021-2022.

Nous l'avons développé en Java avec l'utilisation du framework Spring, parfaitement adapté au développement d'API REST

## Utilisation de l'API:

### Récupérer la liste de tout les étudiants 

* GET (*/ecrudiant/rest/students*)

Code de retour : 200

*Format de la réponse* :

<a href="https://imgbb.com/"><img src="https://i.ibb.co/3znB75F/image-20220519173401652.png" alt="image-20220519173401652" border="0"></a>

### Afficher le détail d'un étudiant 

* GET (*ecrudiant/rest/students/{id}*)

Code de retour : 200

*Format de la réponse* :

<a href="https://imgbb.com/"><img src="https://i.ibb.co/Nyq4PKJ/image-20220519174113838.png" alt="image-20220519174113838" border="0"></a>

### Ajouter un étudiant 

* POST (*/ecrudiant/rest/students* avec les informations dans le body)

  <a href="https://imgbb.com/"><img src="https://i.ibb.co/r35GmZ0/image-20220519174240157.png" alt="image-20220519174240157" border="0"></a>
  
  

Code de retour : 201

*Format de la réponse* :

<a href="https://imgbb.com/"><img src="https://i.ibb.co/6J271Fp/image-20220519174300876.png" alt="image-20220519174300876" border="0"></a>

### Modifier un étudiant 

* PUT (*/ecrudiant/rest/students/{id}* avec les informations dans le body)

<a href="https://imgbb.com/"><img src="https://i.ibb.co/J3PgMXm/image-20220519174446597.png" alt="image-20220519174446597" border="0"></a>

Code de retour : 201

*Format de la réponse* :

<a href="https://imgbb.com/"><img src="https://i.ibb.co/ZdgRV4K/image-20220519174502441.png" alt="image-20220519174502441" border="0"></a>

### Supprimer un étudiant 

* DELETE (*/ecrudiant/rest/students/{id})*

Code de retour : 204
