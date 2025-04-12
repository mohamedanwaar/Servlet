# 🎓 Study Servlet MVC Demo

This is a simple Java web application to demonstrate the usage of:
- Servlets
- JSP (Java Server Pages)
- MVC (Model-View-Controller) Architecture

---

---

## 🌐 What Does This App Do?

This app demonstrates:
- Sending form data from an HTML/JSP page to a **Servlet**
- Processing the data in the **Controller**
- Using a **Model** class to hold student data
- Displaying results on a **JSP View**

---

## 🚀 How to Run

1. Open in IntelliJ IDEA or Eclipse
2. Make sure Apache **Tomcat** is installed and set up
3. Run the app on Tomcat server
4. Visit: `http://localhost:9090/StudyServlet/`

---

## 🧩 Key Components

### 👨‍🏫 Controller (Servlet)
**`StudentsController.java`**
- Acts as the main controller
- Handles form submissions
- Calls the model and forwards data to JSP

### 📦 Model
**`StudentsModel.java`**
- JavaBean class that represents student data (name, email, etc.)

**`StudentModelUtil.java`**
- Helper class to generate or fetch student data

### 🎨 Views (JSP)
| JSP Page             | Description                                  |
|----------------------|----------------------------------------------|
| `index.jsp`          | Welcome page                                 |
| `StudentsView.jsp`   | Displays submitted form data                 |
| `ViewStudents.jsp`   | Shows list of students using model class     |



## 🧠 Learning Outcomes

✅ Understand basic **MVC pattern** using Servlets  
✅ Learn **request forwarding** with `RequestDispatcher`  
✅ Practice using **Model classes** (JavaBeans)  
✅ Display dynamic content using **JSP**

---

## 📚 Technologies Used

- Java 17+
- Apache Tomcat
- JSP + Servlet API
- Maven

---

## ✍️ Author

Mohamed Rashed  
_3rd Year Machine Intelligence Student_  
[Menoufia University]

---




