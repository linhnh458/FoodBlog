
package Test;

import DAL.BlogDAO;
import Models.Blog;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "chocoMousse", urlPatterns = {"/chocoMousse"})
public class ChocoMousseController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        BlogDAO blogdao = new BlogDAO();
        int blogId = Integer.parseInt(request.getParameter("id"));
        Blog blog = blogdao.getBlog(blogId);
        request.setAttribute("blog", blog);
//        request.getRequestDispatcher("PostToedit.jsp").forward(request, response);
        request.getRequestDispatcher("Recipe.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
