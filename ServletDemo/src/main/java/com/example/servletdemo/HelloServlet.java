package com.example.servletdemo;

import java.io.*;


import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.xml.crypto.Data;

@WebServlet(name = "helloServlet", value = "/helloservlet")
public class HelloServlet extends HttpServlet {




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html><head><title>Hello Servlet</title></head><body> ");
        out.println("<h1>Hello Servlet</h1>");
        out.println("<h2> this in server is " + new java.util.Date() + "</h2>");
    }

    public void destroy() {
    }
}