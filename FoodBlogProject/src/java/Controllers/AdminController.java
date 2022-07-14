package Controllers;

import DAL.BlogDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminController", urlPatterns = {"/homeAdmin"})
public class AdminController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("mess", "");
        request.getRequestDispatcher("AdminController.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("cate");
        
        String content = request.getParameter("content");
        //String content = content1.replaceAll("<p>[\\s]*</p>", "\n");
//        String content = content1.replaceAll("</p[^>]*>", "\n");
        System.out.println(content);  
        String date = request.getParameter("date");
        String imagePara = request.getParameter("img");
        String image = "";
        if(imagePara==null){
            image = "";
        }else{
            image = "Images/" + imagePara;
        }
        int cateID = 0;
        if (category.equals("dessert")) {
            category = "Dessert";
            cateID = 1;
        }else if (category.equals("drink")) {
            category = "Drinks";
            cateID = 2;
        }else if(category.equals("tip")){
            category = "Tip";
            cateID = 3;
        }
        BlogDAO dao = new BlogDAO();
        dao.createBlog(title, image, content, category, date, cateID, author);
        request.setAttribute("mess", "Created successfully");
        response.sendRedirect("homeAdmin");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
