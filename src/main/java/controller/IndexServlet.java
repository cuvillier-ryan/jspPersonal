package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet", urlPatterns = "/home")
public class IndexServlet extends HttpServlet {
    // We want to display our home page using this servlet when some loads "http://localhost:8080/'


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // This is where we want to tell the TomCat server to display the webapp/index.jsp template file (as a webpage)

        //The boring way
//        resp.setContentType("text/html");

//        resp.getWriter().println("<h1>Welcome to BurgerWorld!</h1>");
        //End: The boring way

        //The Fun Way!!
        //We want to load the index.jsp template, when this Servlet is called upon
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        //End: The Fun way!!
    }
}
