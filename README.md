# 📘 ECOT12 - Software Project  

Repository containing the codes developed during the experimental classes of the **Software Project (ECOT12)** course.

![GitHub repo size](https://img.shields.io/github/repo-size/12FlyBreads/ecot12-Projeto-Software?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/12FlyBreads/ecot12-Projeto-Software?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 🎯 Course Objectives  
The course aims to:  
- Understand the **object-oriented software design process**.  
- Represent real-world situations using **UML class diagrams**.  
- Convert UML class diagrams into **Java code**.  
- Apply **design patterns** for creation, structuring, and behavior.  

📌 Course taught by **Dr. Enzo Seraphim**.  

---

## 🛠️ Technologies Used  
- **Java** → Programming language used for object-oriented software development.  
- **Maven** → Build tool and dependency management.  
- **DIA** → Software for drawing UML diagrams.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) ![DIA](https://img.shields.io/badge/DIA-0099FF?style=for-the-badge&logo=dia&logoColor=white)

---

## 🧪 Labs (Branches)  
- **lab04** → naruto-class
- **lab05** → spider-class
- **lab05** → eletrica-class
- **lab06** → oraculo-class
- **lab06** → fringe-class

---

## 🚀 How to Run the Code  

1. **Clone the repository**  
   ```bash
   git clone git@github.com:12FlyBreads/ecot12-codes.git
   ```
2. **Switch to the branch**
   ```bash
   git checkout <branch-name>
   ```
3. **Pull the lastest changes**
   ```bash
   git pull origin <branch-name>
   ```
4. **Compile the project**
   ```bash
   mvn clean compile
   ```
5. **Run the project**
   ```bash
   mvn exec:java -Dexec.mainClass="<package-name>.<MainClass>"
   ```
