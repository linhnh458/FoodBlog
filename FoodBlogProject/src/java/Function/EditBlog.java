package Function;

import DAL.BlogDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EditBlog", urlPatterns = {"/editBlog"})
public class EditBlog extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int blogid = Integer.parseInt(request.getParameter("blogid"));
        BlogDAO dao = new BlogDAO();
        request.setAttribute("blog", dao.getBlog(blogid));
        //System.out.println(dao.getBlog(blogid).getCreatedDate());
        request.getRequestDispatcher("EditBlog.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int blogid = Integer.parseInt(request.getParameter("blogid"));
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("cate");
        int cateID = 0;
        if (category.equals("dessert")) {
            category = "Dessert";
            cateID = 1;
        }if (category.equals("drink")) {
            category = "Drinks";
            cateID = 2;
        }else{
            category = "Tip";
            cateID = 3;
        }
        String contentParagraph = request.getParameter("content");
        String content = contentParagraph.replaceAll("\\<.*?\\>", "\n");
        String date = request.getParameter("date");
        String imagePara = request.getParameter("img");
        String image = "Images/" + imagePara;
        BlogDAO dao = new BlogDAO();
        dao.editBlog(title, image, content, category, date, cateID, author, blogid);

        //request.setAttribute("mess", "Updated successfully");
        response.sendRedirect("adminBlogController");
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
