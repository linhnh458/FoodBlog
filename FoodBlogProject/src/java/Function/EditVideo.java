
package Function;

import DAL.VideoDAO;
import Models.RecommendVideo;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EditVideo", urlPatterns = {"/editVideo"})
public class EditVideo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VideoDAO dao = new VideoDAO();
        int vidid = Integer.parseInt(request.getParameter("vidid"));
        RecommendVideo video = dao.getVideoByID(vidid);
        request.setAttribute("video", video);
        request.getRequestDispatcher("EditVideo.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int vidid = Integer.parseInt(request.getParameter("vidid"));
        String des = request.getParameter("des");
        String ytlink = request.getParameter("link");
        VideoDAO dao = new VideoDAO();
        dao.editVideo(vidid, des, ytlink);
        System.out.println("abc edited");
        response.sendRedirect("adminVideo");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
