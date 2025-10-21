#  Task Runner – Spring Boot + MongoDB

A lightweight **Task Execution Management System** built using **Spring Boot** and **MongoDB**.  
This project allows users to create, validate, execute, and track shell commands securely — complete with execution logs, validation, and error handling.

---

##  Features

 Create, update, and delete tasks  
 Secure command validation (prevents unsafe shell injections)  
 Execute shell commands with timeout control  
 Store each execution result (`stdout`, `stderr`, and exit code)  
 RESTful API endpoints for all task operations  
 MongoDB as persistent storage  
 Clean modular architecture (Controller–Service–Repo pattern)  
 Spring Boot auto-configuration and dependency management  

---

##  Project Structure
```
task-runner/
│
├── src/
│ ├── main/
│ │ ├── java/com/example/taskrunner/
│ │ │ ├── controller/TaskController.java
│ │ │ ├── model/Task.java
│ │ │ ├── model/TaskExecution.java
│ │ │ ├── repo/TaskRepository.java
│ │ │ ├── security/CommandValidator.java
│ │ │ ├── service/TaskService.java
│ │ │ └── TaskRunnerApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ ├── static/
│ │ └── templates/
│ └── test/java/com/example/taskrunner/TaskRunnerApplicationTests.java
│
├── pom.xml
├── README.md
└── target/


```

---

## ⚙️ Technologies Used

| Category | Technology |
|-----------|-------------|
| **Backend** | Spring Boot (Java) |
| **Database** | MongoDB |
| **Validation & Security** | Custom Command Validator |
| **Testing** | JUnit 5 |
| **Build Tool** | Maven |
| **Java Version** | 17+ |
| **Dependency Management** | Spring Boot Starter |

---

##  Architecture Overview

###  Layers
1. **Controller Layer** → Handles API endpoints (`/tasks`, `/tasks/{id}`, etc.)  
2. **Service Layer** → Executes commands, handles validation, and saves results  
3. **Repository Layer** → Interacts with MongoDB (`MongoRepository`)  
4. **Model Layer** → Defines `Task` and `TaskExecution` documents  
5. **Security Layer** → `CommandValidator` prevents unsafe commands  

---

##  API Endpoints

###  `GET /tasks`
Fetch all tasks or a specific one using `?id={taskId}`

###  `PUT /tasks`
Create or update a task  
**Body Example:**
```json
{
  "name": "List Files",
  "owner": "Karthik",
  "command": "ls"
}
```

---

### Docker 
<img width="1400" height="336" alt="image" src="https://github.com/user-attachments/assets/b888d40f-1a29-4869-8736-776c28dae9b8" />

---

### Testing 

Create a task (PUT /tasks)
<img width="1456" height="266" alt="image" src="https://github.com/user-attachments/assets/ed7f4cad-4201-4f41-8ab4-0a88b32247c2" />

Get all tasks (GET /tasks)
<img width="1461" height="232" alt="image" src="https://github.com/user-attachments/assets/10537076-f1c2-4564-ae26-476ad38b358f" />

Get single task by id (GET /tasks?id=123)
<img width="1445" height="261" alt="image" src="https://github.com/user-attachments/assets/f6eb2198-4b2f-4dd4-97f1-8cf492408d89" />

Search by name (GET /tasks/search?name=Print)
<img width="1424" height="195" alt="image" src="https://github.com/user-attachments/assets/8404d73b-fb54-40e9-b94f-ea827dd4adae" />

Run a task (PUT /tasks/{id}/executions):
This executes the command on the server (our local container) using ProcessBuilder. Timeouts are applied.
<img width="1331" height="212" alt="image" src="https://github.com/user-attachments/assets/6a321280-64fc-4997-9533-62ca12ed60cb" />

Delete a task (DELETE /tasks/123)
<img width="1227" height="145" alt="image" src="https://github.com/user-attachments/assets/deb0064b-b24a-424d-a232-dc27f58a88bd" />













