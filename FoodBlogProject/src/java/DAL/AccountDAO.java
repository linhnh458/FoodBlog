package DAL;

import Models.AccountAdmin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountDAO extends DBContext {

    public AccountAdmin getAccount(String username, String password) {
        String sql = " select * from [User]\n"
                + "  where UserName = ?\n"
                + "  and UserPassword = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            AccountAdmin b = null;
            while (rs.next()) {
                b = new AccountAdmin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));               
            }
            return b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        //AccountAdmin admin = dao.getAccount("Admin", "Password");
        if(dao.getAccount("Admin", "Password") != null){
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }
    }

}
