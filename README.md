# Master Java Full Stack Development with Spring Boot and ReactJS

## Introduction
Cette application full stack Java utilise **Spring Boot** pour le backend et **ReactJS** pour le frontend. Elle permet de gérer une base de données d'étudiants, incluant des fonctionnalités telles que l'ajout, la mise à jour, la suppression et l'affichage des étudiants. Le projet vise à démontrer la création d'une application complète avec une architecture de projet propre et efficace.

## Fonctionnalités
- **Gestion des étudiants** : Ajouter, afficher, mettre à jour et supprimer des étudiants via l'interface utilisateur React et un backend RESTful avec Spring Boot.
- **Intégration front-end/back-end** : Utilisation de ReactJS pour interagir avec les API du backend Spring Boot via des appels REST.
- **Navigation entre les pages** : Mise en place de la navigation entre les différentes pages (liste des étudiants, formulaire d'ajout, profil d'étudiant) avec React Router.
- **Gestion des exceptions** : Implémentation d'une classe d'exception pour gérer les erreurs dans l'API REST de Spring Boot.

## Prérequis
- **Java 21+**
- **Node.js 14+**
- **MySQL**
- **IntelliJ IDEA ou VS Code**

## Installation

### Backend (Spring Boot)
1. Clonez le repository :
   ```bash
   git clone https://github.com/hhachich/fullstack-training-springBoot-react-01.git
   cd fullstack-training-springBoot-react-01
   ```

2. Configurez votre base de données dans `application.properties` :
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/votre_db
   spring.datasource.username=votre_username
   spring.datasource.password=votre_password
   ```

3. Compilez et démarrez le backend :
   ```bash
   ./mvnw spring-boot:run
   ```

### Frontend (ReactJS)
1. Allez dans le dossier `frontend` :
   ```bash
   cd frontend
   ```

2. Installez les dépendances :
   ```bash
   npm install
   ```

3. Lancez l'application React :
   ```bash
   npm start
   ```

L'application React sera accessible sur `http://localhost:3000`.

## Étapes de développement

### Backend - Spring Boot
1. **Configuration du projet** : Initialisez un projet Spring Boot avec les dépendances nécessaires telles que **Lombok**, **Spring Data JPA**, **Spring Web** et **MySQL**.
   
2. **Création des packages** :
   - **Model** : Contient les entités Java telles que `Student`.
   - **Repository** : Interface pour accéder aux données des étudiants.
   - **Service** : Logique métier pour manipuler les données.
   - **Controller** : Expose les endpoints REST pour interagir avec le frontend.

3. **Création des entités et méthodes CRUD** :
   - Créez l'entité `Student` avec des attributs comme `id`, `name`, `email`, et `department`.
   - Implémentez des méthodes pour ajouter, mettre à jour, supprimer et récupérer des étudiants dans la base de données via un service Spring.
   - Utilisez un contrôleur `StudentController` pour exposer les méthodes via des endpoints RESTful.

4. **Gestion des exceptions** :
   - Implémentez une classe d'exception personnalisée pour gérer les erreurs liées aux opérations CRUD.
   - Utilisez Postman pour tester les API, notamment les erreurs comme la suppression d'un étudiant inexistant.

### Frontend - ReactJS
1. **Initialisation du projet** : Créez un projet React dans le dossier `frontend` et installez **React Router Dom** pour gérer la navigation.

2. **Création des composants** :
   - Créez des composants React pour gérer les fonctionnalités suivantes :
     - Liste des étudiants (`StudentList`).
     - Formulaire d'ajout de nouveaux étudiants (`AddStudent`).
     - Profil d'un étudiant (`StudentProfile`).

3. **Intégration avec le backend** :
   - Utilisez la bibliothèque **axios** pour effectuer des appels HTTP aux endpoints REST de Spring Boot.
   - Implémentez les méthodes pour récupérer, ajouter et supprimer des étudiants depuis la base de données.

4. **Navigation avec React Router** :
   - Configurez les routes pour naviguer entre les différentes pages de l'application, telles que la liste des étudiants, le formulaire d'ajout, et les profils d'étudiants.

5. **Formulaire d'ajout et gestion des états** :
   - Créez un formulaire avec des champs pour ajouter des étudiants.
   - Utilisez **useState** et **useEffect** pour gérer les états et récupérer les données depuis le backend.

6. **Gestion de la redirection** :
   - Après l'ajout ou la modification d'un étudiant, redirigez l'utilisateur vers une autre page (par exemple, la liste des étudiants).

## Exemple d'utilisation

1. **Ajout d'un étudiant** : Accédez à la page d'ajout d'étudiant, remplissez les champs et soumettez le formulaire.
2. **Visualisation du profil** : Cliquez sur un étudiant dans la liste pour afficher ses détails.
3. **Modification et suppression** : Modifiez les informations d'un étudiant ou supprimez-le directement depuis l'interface.

## Conclusion

Cette application full stack illustre comment combiner **Spring Boot** et **ReactJS** pour créer une application complète. Elle permet de gérer efficacement une base de données d'étudiants avec un backend robuste et un frontend moderne.

# Project
![Alt text](/images/1.png)
![Alt text](/images/2.png)
![Alt text](/images/3.png)
![Alt text](/images/4.png)
![Alt text](/images/5.png)
![Alt text](/images/6.png)

# Lien
https://www.youtube.com/watch?v=MTj7vk9F02A