# StudentManager API (Dockerized)

A Spring Boot REST API for managing student records, fully containerized using Docker and Docker Compose with a MySQL database. This project demonstrates backend development, RESTful API design, database integration, and multi-container orchestration.

---

## ⚙️ Tech Stack

- Java 25
- Spring Boot
- MySQL 8
- Docker
- Docker Compose

---

## 🚀 Features

- Create, read, update, delete (CRUD) student records
- RESTful API architecture
- MySQL database integration
- Fully containerized backend + database
- Multi-container orchestration using Docker Compose
- Health-checked service dependency between Spring Boot and MySQL

---

## 📦 How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/kjingtat/StudentManager-API.git
cd StudentManager-API
```

### 2. Run with Docker

```bash
docker-compose up --build
```

---

## 🌐 Services

| Service | URL |
|--------|-----|
| Spring Boot API | http://localhost:8080 |
| MySQL Database | localhost:3308 |

---

## 🧪 How to Stop the Application

```bash
docker-compose down
```

---

## 🧠 What I Learned

- How to build REST APIs using Spring Boot
- How to connect Spring Boot to MySQL
- How to containerize applications using Docker
- How to use Docker Compose for multi-service applications
- How to debug multi-container startup issues
- How to use healthchecks for service dependencies

---

## 📁 Project Structure

```
StudentManager-API/
│
├── src/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── .dockerignore
├── .gitignore
└── README.md
```

---

## 🔥 Author Notes

This project was built as a backend + DevOps learning exercise to simulate real-world application deployment using containerized microservices.

---
