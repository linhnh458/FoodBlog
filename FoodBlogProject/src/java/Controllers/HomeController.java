package Controllers;

import DAL.BlogDAO;
import DAL.CommentDAO;
import Models.Blog;
import Models.Review;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        CommentDAO dao = new CommentDAO();
        ArrayList<Review> listReview = dao.getReview(0);
        BlogDAO b = new BlogDAO();
        //get dessert blogs
        ArrayList<Blog> listDessert = b.getBlogHome();
       
        request.setAttribute("review", listReview);
        request.setAttribute("dessert", listDessert);
        request.setAttribute("response", "");
        request.getRequestDispatcher("Home.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        if (job.equals(null)) {
            job = "";
        }
        String mes = request.getParameter("msg");
        CommentDAO dao = new CommentDAO();
        dao.insertReview(name, job, mes);
        request.setAttribute("response", "Thank you for sharing with me!");
        response.sendRedirect("home");
    }

}
