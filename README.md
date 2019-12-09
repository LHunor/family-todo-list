# Family TODO List
Simple family task planner, aka todo list.
## Functional requirements:
### For guests
On the front page a [guest](#vocational-dictionary) can read the app's description, login or register(#vocational-dictionary).
### For users
After the registration [user](#vocational-dictionary) can 
* observe the [dashboard](#vocational-dictionary), which contains active [tasks](#vocational-dictionary)
* create and edit tasks
* delete tasks
### About tasks
A task contains information that can be divided into three parts:
task title, description, stage 
***
## Non-functional requirements
* User-friendly, intuitive, simple & clean interface
* Fast and smooth functioning

### Vocational dictionary
* **Guest:** A person who is visiting the site and has not registered/logged in
* **User:** A registered person who is logged in to the site
* **Dashboard:** Front page for registered users. It contains main information about active tasks in convenient form (calendar, list)
* **Task:** Tasks are the main units of the application used to keep things under control, simplify family workflow or even manage a project lifecycle. Task contents description can be found [here](#about-tasks)
* **Stage:** A marker for following the progress of a task.
# Example of use:
Mother creates a new task "wash dishes", sets deadline to 6 p.m. and assigns Son1 user to it. 
Son1 leaves a comment "Can't do it, I have to do my Alkalmazások fejlesztése homework" and reassings the task to Son2.  
Son2 washes the dishes and marks the task as done.
## Használati eset diagram
![Használati eset diagram](/images/usecase_diagram.png)
## Fejlesztői környezet bemutatása
A szerver oldal IntelliJ IDE használatával készült, a kliens oldal pedig VSC-vel.
Verziókezelőként Githubot használtunk.
## Könyvtárstruktúra
### Modelek
User.java
Stage.java
Task.java
### Kontrollerek
UserController.java
StageController.java
TaskController.java
### Nézetek
description component
task-list component
login / register components
## Kliensoldali szolgáltatások
Bejelentkezés / regisztrálás
Taskok létrehozása, editálása, törlése
## Egy task törlésének folyamata
Lehetőség van a listából elemeket törölni.
Miután kijelöltünk egy taskot, lehetőségünk van rányomni egy törlés gombra, amely hatására lefut az onDeleteClick(task.id) függvény a megfelelő id-vel.Ebben a függvényben az elsősorban kitöröljük a backendből az adott elemet, majd utána újratöltjük a komponenst.
## Felhasználói dokumentáció
### Bejelentkezés / Regisztráció
Az oldalra úgy lehet bejelentkezni / regisztrálni, ha a megfelelő fülre kattintva (vagy url megadásával) eljutunk az adott formig,     ahol megadjuk az adatainkat.
### Taskok kezelése
A task listában láthatjuk, hogy milyen feladatok vannak feljegyezve.
A taskokat lehet szűrni folyamatbeli állásuk szerint, ha a lista alatti gombokra kattintunk.
Ha törölni szeretnénk egy taskot, rá kell kattintani az adott sorra a listában, majd a megjelenő delete gombra is kattintani kell.
Ha updatelni szeretnénk egy taskot, akkor rá kell kattintani az adott taskra, majd a lista alatt megjelenő formot kitöltve és a submit   gombot megnyomva a lista frissűlni fog.
Ha létre akarunk hozni egy új taskot, akkor a new task gomb megnyomása után megint ki kell tölteni a formot és submitelni.  

