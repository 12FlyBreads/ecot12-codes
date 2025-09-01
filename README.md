# 📘 ECOT12 - Projeto de Software  

Repositório com os códigos desenvolvidos nas aulas experimentais da disciplina **Projeto de Software (ECOT12)**.  

---

## 🎯 Programa de Curso  
A disciplina tem como objetivo:  
- Compreender o processo de **projeto de software orientado a objetos**.  
- Representar situações do mundo real com **diagramas de classes UML**.  
- Converter diagramas de classes UML em **código Java**.  
- Aplicar **padrões de projeto** de criação, estruturação e comportamento.  

📌 Disciplina ministrada pelo professor **Dr. Enzo Seraphim**.  

---

## 🛠️ Tecnologias Utilizadas  
- **Maven** → Ferramenta de build e gerenciamento de dependências.  
- **DIA** → Software para desenho de diagramas UML.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) 
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)  

---

## 🧪 Laboratórios  
- **lab04** → Classe *Naruto*  

---

## 🚀 Como Rodar os Códigos  

1. **Clonar o repositório**  
   ```bash
   git clone <url-do-repositorio>
   ```
2. **Trocar a branch**
   ```bash
   git checkout <nome-da-branch>
   ```
3. **Pull**
   ```bash
   git pull origin <nome-da-branch>
   ```
4. **Compile**
   ```bash
   mvn clean compile
   ```
5. **Run**
   ```bash
   mvn exec:java -Dexec.mainClass="<nome-do-pacote>.<ClassePrincipal>"
   ```
