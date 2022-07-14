
package Function;

import DAL.VideoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ChangeVideoStatus", urlPatterns = {"/changeVideoStatus"})
public class ChangeVideoStatus extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int temp = Integer.parseInt(request.getParameter("status"));
        //boolean status = temp == 1 ? true : false;
        int status = temp == 1 ? 1 : 0;
        VideoDAO dao = new VideoDAO();
        dao.updateStatusVideo(status, id);
        response.sendRedirect("adminVideo");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
