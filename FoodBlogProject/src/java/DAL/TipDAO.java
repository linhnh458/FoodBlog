package DAL;

import Models.Blog;
import Models.Tip;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TipDAO extends DBContext {

    public ArrayList<Tip> getAllTips() {
        ArrayList<Tip> list = new ArrayList<>();
        String sql = "select * from Blog where CategoryID = 3";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tip t = new Tip(rs.getInt("BlogID"),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(t);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void insertTip(String tipname, String image, String content, String cate, int cateid, String date,String author) {
        String sql = "INSERT INTO [dbo].[Tip]\n"
                + "           ([TipName]\n"
                + "           ,[TipImage]\n"
                + "           ,[TipContent]\n"
                + "           ,[Category]\n"
                + "           ,[CategoryID]\n"
                + "           ,[DateCreated]\n"
                + "           ,[Author])\n"
                + "     VALUES\n"
                + "           (? \n"
                + "           ,? \n"
                + "           ,? \n"
                + "           ,? \n"
                + "           ,? \n"
                + "           ,? \n"
                + "           ,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, tipname);
            stm.setString(2, image);
            stm.setString(3, content);
            stm.setString(4, cate);
            stm.setInt(5, cateid);
            stm.setString(6, date);
            stm.setString(7, author);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//    public Tip getTip(int tipid) {
////        String sql = "select * from tip where tipid = ?";
//        String sql = "select * from blog where CategoryID = 3 and BlogID = ?";
//        try {
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setInt(1, tipid);
//            ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                Tip t = new Tip(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
//                        rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getString(8));
//                return t;
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }
    
    public Blog getTip(int tipid) {
        String sql = "select * from blog where CategoryID = 3 and BlogID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, tipid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog t = new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getDate(6), rs.getInt(7), rs.getString(8));
                return t;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void deleteTip(int tipid) {
        String sql = "delete from tip where tipid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, tipid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        TipDAO tip = new TipDAO();
//        ArrayList<Tip> list = tip.getAllTips();
//        for (Tip tip1 : list) {
//            System.out.println(tip1.getDateCreated());
//        }
        Blog t = tip.getTip(31);
        System.out.println(t.getContent());
    }
}
