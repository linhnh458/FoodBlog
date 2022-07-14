
package Controllers;

import DAL.VideoDAO;
import Models.RecommendVideo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AdminVideoController", urlPatterns = {"/adminVideo"})
public class AdminVideoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        VideoDAO vid = new VideoDAO();
        ArrayList<RecommendVideo> listVideo = vid.getVideoByRole("admin");
        for (RecommendVideo rv : listVideo) {
            System.out.println(rv.getDescription());
        }
        request.setAttribute("video", listVideo);
        request.getRequestDispatcher("AdminVideoController.jsp").forward(request, response);
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

}
