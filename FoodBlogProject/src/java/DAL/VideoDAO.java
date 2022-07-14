package DAL;

import Models.RecommendVideo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VideoDAO extends DBContext {

    public ArrayList<RecommendVideo> getVideoByRole(String role) {
        ArrayList<RecommendVideo> listVideo = new ArrayList<>();
        String sql = "";
        if (role.equals("admin")) {
            sql = "Select * from VideoRecommend";
        } else {
            sql = "select * from VideoRecommend where Status = 1";
        }
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String fullLink = rs.getString(2);
                String[] embedLink = fullLink.split("=", 2);
                RecommendVideo video = new RecommendVideo(rs.getInt(1), "https://www.youtube.com/embed/" + embedLink[1],
                        rs.getString(3), rs.getInt(4));
                listVideo.add(video);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listVideo;
    }

    public RecommendVideo getVideoByID(int id) {
        String sql = "Select * from VideoRecommend where videoid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                RecommendVideo video = new RecommendVideo(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4));
                return video;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void addVideo(String ytlink, String description) {
        String sql = "INSERT INTO [dbo].[VideoRecommend]\n"
                + "           ([YoutubeLink]\n"
                + "           ,[Description])\n"
                + "VALUES (?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, ytlink);
            stm.setString(2, description);
            ResultSet rs = stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStatusVideo(int status, int id) {
        String sql = "UPDATE [dbo].[VideoRecommend]\n"
                + "SET [Status] = ?\n"
                + "WHERE videoid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, status);
            stm.setInt(2, id);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editVideo(int vidid, String description, String ytLink) {
        String sql = "UPDATE [dbo].[VideoRecommend]\n"
                + "   SET [YoutubeLink] = ?\n"
                + "      ,[Description] = ?\n"
                + " WHERE VideoID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, ytLink);
            stm.setString(2, description);
            stm.setInt(3, vidid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteVideo(int vidid) {
        String sql = "delete from VideoRecommend where VideoID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, vidid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        VideoDAO vid = new VideoDAO();
        ArrayList<RecommendVideo> list = vid.getVideoByRole("user");
        for (RecommendVideo rv : list) {
            System.out.println(rv.getYoutubeLink());
        }
//        RecommendVideo rv = vid.getVideoByID(1);
//        System.out.println(rv.getDescription());
    }

}
