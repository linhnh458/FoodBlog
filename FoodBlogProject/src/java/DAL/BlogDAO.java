package DAL;

import Models.Blog;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BlogDAO extends DBContext {

    public ArrayList<Blog> getBlogHome() {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "Select * from Blog where BlogID in (1,2,3,4,5,6)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(
                        rs.getInt(1),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Blog> getAllBlogs() {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "Select * from Blog";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt("BlogID"),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public Blog getBlog(int blogid) {
        String sql = "select * from Blog where BlogID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, blogid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getString("Author"));
                return b;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Blog getBlogByCategory(int blogid, int cate) {
        String sql = "select * from Blog where BlogID = ? and CategoryID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, blogid);
            stm.setInt(2, cate);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getString("Author"));
                return b;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public ArrayList<Blog> getBlogDessert() {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "select * from Blog where CategoryID = 1";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt("BlogID"),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Blog> getBlogRecommend() {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "select * from Blog where BlogID = 1 or BlogID = 2 or BlogID = 3";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt("BlogID"),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public ArrayList<Blog> getBlogDrink() {
        ArrayList<Blog> list = new ArrayList<>();
        String sql = "select * from Blog where Category = 'Drinks'";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getInt("BlogID"),
                        rs.getString("BlogTitle"),
                        rs.getString("Image"),
                        rs.getString("Content"),
                        rs.getString("Category"),
                        rs.getDate("CreatedDate"),
                        rs.getInt("CategoryID"),
                        rs.getString("Author"));
                list.add(b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void createBlog(String title, String image, String content, String cate, String createdDate, int cateID, String author) {
        String sql = "INSERT INTO [dbo].[Blog]\n"
                + "           ([BlogTitle]\n"
                + "           ,[Image]\n"
                + "           ,[Content]\n"
                + "           ,[Category]\n"
                + "           ,[CreatedDate]\n"
                + "           ,[CategoryID]\n"
                + "           ,[Author])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, title);
            stm.setString(2, image);
            stm.setString(3, content);
            stm.setString(4, cate);
            stm.setString(5, createdDate);
            stm.setInt(6, cateID);
            stm.setString(7, author);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editBlog(String title, String image, String content, String cate, String createdDate, int cateID, String author, int blogid) {
        String sql = "UPDATE [dbo].[Blog]\n"
                + "   SET [BlogTitle] = ? \n"
                + "      ,[Image] = ? \n"
                + "      ,[Content] = ? \n"
                + "      ,[Category] = ? \n"
                + "      ,[CreatedDate] = ? \n"
                + "      ,[CategoryID] = ? \n"
                + "      ,[Author] = ? \n"
                + " WHERE blogid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, title);
            stm.setString(2, image);
            stm.setString(3, content);
            stm.setString(4, cate);
            stm.setString(5, createdDate);
            stm.setInt(6, cateID);
            stm.setString(7, author);
            stm.setInt(8, blogid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteBlog(int blogid) {
        String sql = "delete from blog where blogid = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, blogid);
            stm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        BlogDAO b = new BlogDAO();
//        ArrayList<Blog> list = b.getBlogRecommend();
//        for (Blog blog : list) {
//            System.out.println(blog.getBlogTitle());
//        }
        Blog bl = b.getBlog(1);
        System.out.println(bl.getBlogTitle());

//        b.createBlog("Samosa", "", "Potato", "Dessert", "2022-12-12", 1, "Indiana");
    }
}
