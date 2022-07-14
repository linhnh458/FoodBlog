
package Controllers;

import DAL.VideoDAO;
import Models.RecommendVideo;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "VideoController", urlPatterns = {"/recommend"})
public class RecommendController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        VideoDAO vid = new VideoDAO();
        ArrayList<RecommendVideo> listVideo = vid.getVideoByRole("user");
        request.setAttribute("video", listVideo);
        request.getRequestDispatcher("Recommend.jsp").forward(request, response);
    }
}
