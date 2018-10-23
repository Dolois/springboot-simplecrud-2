### java-springboot-simplecrud-2

#### Un serveur REST ultra basique créé avec SpringBoot 
#### qui utilise une base de données H2 (intégrée au serveur d'application) via JPA/Hibernate.

#### Modèle de données

#### Créer le code qui permet la mise à disposition des informations:

#### Présentation de l'API REST

#### API suivante :
 * GET /api/acteur : liste les informations de l'ensemble des instances dʼActeur.
 * GET /api/film : liste les informations de l'ensemble des instances de film.
 * GET /api/acteur/[id] : renvoie les informations d'une instance d'objet Acteur avec son id.
 * GET /api/film/[id] : renvoie les informations d'une instance d'objet film avec son id.
 * POST /api/acteur : crée une nouvelle instance de Acteur avec les informations fournies.
 * PUT /api/acteur/[id] : met à jour l'instance dʼActeur correspondant à l'id fourni avec les informations fournies.
 * PUT /api/film/[id] : met à jour l'instance de film correspondant à l'id fourni avec les informations fournies.

### Compilation et exécution
#### Dans un terminal, 
#### se placer dans le répertoire du projet et 
#### lancer les commandes ci- dessous.

#### Compilation : mvnw clean install 

#### Lancement du serveur : mvnw spring-boot:run
