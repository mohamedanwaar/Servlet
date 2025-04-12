package com.example.servletdemo;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ReadDataXML")
public class ReadDataXML extends HttpServlet {

    protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException
    {
        //set the content type  (this is back to browser)
        response.setContentType("text/html");
        //get the print writer
        PrintWriter out=response.getWriter();
        // step 3 read configuration parameters from the xml file
        ServletContext context=getServletContext();
        String filename=context.getInitParameter("firstName");
        String lastName=context.getInitParameter("lastName");
        out.println("<html> <body>");
        out.println("<h1> first name is :"+filename+"</h1>");
        out.println("<h2> last name is : "+lastName+"</h2>");
        out.println("</body> </html>");

         

    }

}
