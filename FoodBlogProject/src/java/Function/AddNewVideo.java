
package Function;

import DAL.VideoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddNewVideo", urlPatterns = {"/addNewVideo"})
public class AddNewVideo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("AddNewVideo.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String des = request.getParameter("des");
        String ytlink = request.getParameter("link");
        VideoDAO dao = new VideoDAO();
        dao.addVideo(ytlink, des);
        
        response.sendRedirect("adminVideo");
    }

}
