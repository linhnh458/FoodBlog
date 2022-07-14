package DAL;

import Models.Comment;
import Models.Review;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CommentDAO extends DBContext {

    public ArrayList<Comment> getCommentByBlogID(int blogid) {
        ArrayList<Comment> list = new ArrayList<>();
        String sql = "Select * from Comment where BlogID = ? ";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, blogid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Comment c = new Comment(
                        rs.getInt(1),
                        rs.getString("Content"),
                        rs.getInt("blogID"),
                        rs.getString("BlogTitile"),
                        rs.getString("Username"));
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void insertComment(String content, String username, int blogid) {
        String sql = "INSERT INTO [dbo].[Comment]\n"
                + "           ([Content]\n"
                + "           ,[BlogID]\n"
                + "           ,[BlogTitile]\n"
                + "           ,[Username])\n"
                + "VALUES (?,?,'',?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, content);
            stm.setInt(2, blogid);
            stm.setString(3, username);
            stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteComment(int blogid, int commentid) {
        String sql = "select * from Comment\n"
                + "DELETE FROM [dbo].[Comment] \n"
                + "WHERE BlogID = ? and commentID = ? ";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, blogid);
            stm.setInt(2, commentid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Review> getReview(int roleID) {
        ArrayList<Review> list = new ArrayList<>();
        String sql = "";
        if (roleID == 1) {
            sql = "select * from user_review";
        } else {
            sql = "select * from user_review where Status = 1 ";
        }
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Review r = new Review(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5));
                list.add(r);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void insertReview(String name, String job, String message) {
        String sql = "INSERT INTO [dbo].[User_Review] \n"
                + "([Name],[Job],[Review])\n"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, name);
            stm.setString(2, job);
            stm.setString(3, message);
            stm.executeQuery();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateStatusReview(boolean status, int reviewid) {
        String sql = "UPDATE [dbo].[User_Review]\n"
                + "   SET [Status] = ?\n"
                + " WHERE reviewid =  ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setBoolean(1, status);
            stm.setInt(2, reviewid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteReview(int reviewid) {
        String sql = "delete from User_Review where ReviewID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, reviewid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        CommentDAO da = new CommentDAO();
        da.deleteReview(7);
//        ArrayList<Comment> list = da.getCommentByBlogID(1);
//        for (Comment r : list) {
//            System.out.println(r.getCommentID());
//        }

//        da.updateStatusReview(true, 1);
//        da.insertComment("ice cream", "user comment", 6);
//        ArrayList<Comment> list = da.getCommentByBlogID(1);
//        for (Comment comment : list) {
//            System.out.println(comment.getContent());
//        }
    }
}
