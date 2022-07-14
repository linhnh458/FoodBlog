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

@WebServlet(name = "DisplayBlogs", urlPatterns = {"/dessert"})
public class DessertController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        BlogDAO blogdao = new BlogDAO();
        int blogid = 0;
        if (request.getParameter("blogid") != null) {
            blogid = Integer.parseInt(request.getParameter("blogid"));
            //get blog and its comments
            Blog blog = blogdao.getBlog(blogid); //get blog
            CommentDAO comdao = new CommentDAO();
            ArrayList<Comment> listComment = comdao.getCommentByBlogID(blogid); //get comment
            ArrayList<Blog> listDessert = blogdao.getBlogDessert();

            request.setAttribute("blog", blog);
            request.setAttribute("dessert", listDessert);
            HttpSession session = request.getSession();
            session.setAttribute("listComment", listComment);
            session.setAttribute("blogid", blogid);

            session.setAttribute("email", "");
            session.setAttribute("content", "");
            request.getRequestDispatcher("DisplayDessert.jsp").forward(request, response);
        } else {
            ArrayList<Blog> listBlog = blogdao.getBlogDessert();
            request.setAttribute("listBlog", listBlog);
            request.getRequestDispatcher("Dessert.jsp").forward(request, response);
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
        response.sendRedirect("dessert?blogid=" + blogid);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
