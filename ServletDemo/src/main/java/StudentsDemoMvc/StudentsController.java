package StudentsDemoMvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/StudentsController")
public class StudentsController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // step 0 add data
        // get student  data from the helper class that return list of Students
        List<StudentsModel> Students= StudendModelIUtail.getstudent();
        request.setAttribute("students", Students);

        // step 1 get request dispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("StudentsView.jsp");
        // forward the request to JSP
        dispatcher.forward(request, response);

    }
}



