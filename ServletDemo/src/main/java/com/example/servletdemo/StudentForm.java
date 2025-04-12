package com.example.servletdemo;


import java.io.*;


import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.xml.crypto.Data;

@WebServlet(name = "StudentForm", value = "/StudentForm")
public class StudentForm extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();//Prepares to send data back to the browser (HTML in this case).
     //out is used like System.out but for HTTP responses.
     out.println("<html>");
     out.println("<head>");
     out.println("<title>Servlet StudentForm</title>");
     out.println("</head>");
     out.println("<body>");
     out.println("<h1>Servlet StudentForm</h1>");
     out.println("hello  "+request.getParameter("firstName") + "  "+ request.getParameter("lastName"));
     out.println("</body>");
     out.println("</html>");



    }

    public void destroy() {
    }
}
