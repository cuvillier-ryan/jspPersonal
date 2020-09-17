package controller;

<<<<<<< HEAD
import model.Burger;

=======
>>>>>>> 82558ecd35f46a49778756540acfb70468f4001e
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/home")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'
=======

@WebServlet(name = "IndexServlet", urlPatterns = "/home")
public class IndexServlet extends HttpServlet {
    // We want to display our home page using this servlet when some loads "http://localhost:8080/'
>>>>>>> 82558ecd35f46a49778756540acfb70468f4001e


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
<<<<<<< HEAD
        // This will be the page we access when we hit 'http://localhost:8080/ - without any URL patterns to recognize
        // resp.setContentType("text/html");
        // PrintWriter out = resp.getWriter();

        // We'll only be printint a simple message showing that this is the home page
        // out.println("Welcome to Burgers 'R Us!");

        // TODO: After printing our simple message, let's step up our game and print out some awesome HTML instead, by utilizing some templates!
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // the path is relative to our 'webapp' folder

    }
}
=======
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
>>>>>>> 82558ecd35f46a49778756540acfb70468f4001e
