package Controllers;

import DAL.BlogDAO;
import DAL.CommentDAO;
import Models.Blog;
import Models.Comment;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "DrinkController", urlPatterns = {"/drink"})
public class DrinkController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        BlogDAO blogdao = new BlogDAO();
        int blogid = 0;
        //final int category = 2;
        if (request.getParameter("blogid") != null) {
            blogid = Integer.parseInt(request.getParameter("blogid"));
            Blog blog = blogdao.getBlog(blogid);
            //Blog blog = blogdao.getBlogByCategory(blogid,category);
            CommentDAO comdao = new CommentDAO();
            ArrayList<Comment> listComment = comdao.getCommentByBlogID(blogid);
            ArrayList<Blog> listDrink = blogdao.getBlogDrink();

            request.setAttribute("blog", blog);
            request.setAttribute("drink", listDrink);
            HttpSession session = request.getSession();
            session.setAttribute("listComment", listComment);
            session.setAttribute("blogid", blogid);

            request.getRequestDispatcher("DisplayDrink.jsp").forward(request, response);
        } else {
            ArrayList<Blog> listBlog = blogdao.getBlogDrink();
            request.setAttribute("listBlog", listBlog);
            request.getRequestDispatcher("Drink.jsp").forward(request, response);
        }

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
        HttpSession session = request.getSession();
        CommentDAO comdao = new CommentDAO();

        String comment = request.getParameter("msg"); //get comment content
        int blogid = Integer.parseInt(session.getAttribute("blogid").toString()); //get blogid
        String name = request.getParameter("name"); //get username

        comdao.insertComment(comment, name, blogid);
        ArrayList<Comment> listComment = comdao.getCommentByBlogID(blogid);

        session.setAttribute("listComment", listComment);
        response.sendRedirect("drink?blogid=" + blogid);
    }

}
