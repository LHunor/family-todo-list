# Family TODO List
Simple family (multiuser) task planner, aka todo list.
## Functional requirements:
### For guests
On the from page a [guest](#vocational-dictionary) can read the app's description with some screenshots, login to existings group or register and create new [group](#vocational-dictionary).  
For simplified registration and joining to existing group a guest should obtain the invitation link from the group's [admin](#vocational-dictionary).
### For users
After the registration [user](#vocational-dictionary) can 
* observe the [dashboard](#vocational-dictionary), which contains active [tasks](#vocational-dictionary)
* search for tasks by title or [tags](#vocational-dictionary)
* create and edit tasks
* modify task's [stage](#vocational-dictionary) 
* [(Re)assign a user](#vocational-dictionary) to a task
* Read and write [comments](#vocational-dictionary)
* Delete owned tasks
### For admins
After registration of a new group its creator becomes admin. Besides user's funcions admin can  
* invite and remove users
* edit usernames and reset passwords
* manage tags and stages
* partially or fully clear task and comment [history](#vocational-dictionary)
### About tasks
A task contains information that can be divided into three parts:
* **Permanent:** task creation time, task owner
* **Modifiable by owner:** taks title, description, [due date](#vocational-dictionary)
* **Mutable (can be modified by everyone):** task stage, assigned user, tags  
***
## Non-functional requirements
* User-friendly, intuitive, simple & clean interface
* Family oriented, e.g. low privileges for children, olny one email per group required etc.
* Fast and smooth functioning
* Password protection and secure storage

### Vocational dictionary
* **Guest:** A person tho visits the site and did not register/log in
* **User:** A registered person who is logged in to the site but doesn't have admin priveleges
* **Admin:** A group creator, has more priveleges than a normal user
* **Group:** In basic usage this equals family. Only group members have access to any information about that group
* **Dashboard:** Front page for registered users. It contains main information about active tasks in convenient form (calendar, list)
* **Task:** Tasks are the main units of the application used to keep things under control, simplify family workflow or even manage a project lifecycle. Task contents description can be found [here](#about-tasks)
* **Stage:** A marker for following the progress of a task. By default there are three stages: "TODO", "In progress" and "Done". Admins can edit list of available stages.
* **Flow:** A lifecycle of a task, represented by changing stages, history of assigns and comments.
* **Due date:** Date and time for task to be completed, aka deadline
* **User assinging:** Assinging a user to a task means telling this user (and everyone else) that he or she now has the duty and responsibility to complete this task. It helps users to organize their work.
* **Tag:** A marker used to help searching, grouping and filtering tasks. One task can have more tags. Admins can edit list of available tags.
* **Comments:** A section within task details used for chatting between members about that task. Can be used for clarifying and justifying stage changes, re-assigns or delays.
* **History:** History contains every change made to a task since it was created. Can be cleared by admins.
***
# Example of use:
Mother creates a new task "wash dishes", sets deadline to 6 p.m. and assign Son user to it. 
Son1 leaves a comment "Can't do it, I have to do my Alkalmazások fejlesztése homework" and reassings the task to Son2
Son2 washes the dishes and marks the task as done.

