import java.sql.*;

public class feature {
    public static void main(String[] args) {
        try (
                Connection bk = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement tv = bk.createStatement();
                ) {
            String strSelect = "slect id ,name,price, author,catID, qty from books ";
            System.out.println("Book viewing feature : " + strSelect + "\n");
            ResultSet rset = tv.executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()){

                int id  = rset.getInt("id");
                String name = rset.getString("name");
                int price = rset.getInt("price");
                int catID = rset.getInt("catID");
                int    qty   = rset.getInt("qty");
                System.out.println(id + "," + price + "," + catID + ","+ qty);
                ++rowCount;
            }
            System.out.println("Xem toàn bỘ 10 cuốn sách mới nhất\n");

//          Tìm sách theo thể loại (người dùng nhập thể loại, sau đó sẽ hiển thị sách theo thể loại
//đó)
            String strSelect1 = "slect catID,  name from category ";
            System.out.println("Book viewing feature : " + strSelect1 + "\n");
            ResultSet rset1 = tv.executeQuery(strSelect1);
            System.out.println("The records selected are:");
            int rowCoun1 = 0;
            while (rset1.next()){


                String name = rset1.getString("name");
                int catID = rset1.getInt("catID");

                System.out.println( catID + ","+ name);
                ++rowCoun1;
            }
            System.out.println("Tìm sách theo thể loại\n");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//String author = rset.getString("author");
// int orderID = rset.getInt("orderID");
//int productID = rset.getInt("productID");
//String total = rset.getString("total");
