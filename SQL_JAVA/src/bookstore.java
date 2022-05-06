import java.sql.*;

public class bookstore {
    public static void main(String[] args) {
        try (
                Connection bs = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement dt = bs.createStatement();

        ) {
            String listed = "select name , price, NXB from describe ";
            System.out.println("Hệ thống bán sách online là " + listed + "\n");
            ResultSet rset = dt.executeQuery(listed);
            System.out.println("Danh sách cần tìm");
            int Democount = 0;

            while (rset.next()){
                while (rset.next()){
                    String name = rset.getString("Thể Loại");
                    double price = rset.getDouble("100");
                    String NXB = rset.getString("Linh");

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//    create database if not exists ebookstore;
//
//        use ebookstore;
//        drop table if exists category;
//
//        CREATE TABLE `category`(
//        catID int NOT NULL,
//        name varchar(50),
//        PRIMARY KEY (catID)
//        )ENGINE = INNODB;
//        drop table if exists book;
//        CREATE TABLE `book`(
//        id int NOT NULL,
//        price int ,
//        author varchar(30),
//        qty int ,
//        catID int,
//        FOREIGN KEY (catID) REFERENCES cat(ID) ON DELETE CASCADE
//        )ENGINE = INNODB;
//        CREATE TABLE `order_detaill`(
//        OrderID int,
//        productID int,
//        qty date,
//        price float(20),
//        FOREIGN KEY(OrderID)
//        )ENGINE = INNODB;
//        CREATE TABLE `orders` (
//        OrderID int,
//        total varchar(50),
//        lastName varchar(30),
//        cusID INT,
//        status varchar(50),
//        PRIMARY KEY (OrderID),
//        FOREIGN KEY (cusID)
//        )ENGINE = INNODB;
//        CREATE TABLE `customer` (
//        cusID int,
//        name varchar(20),
//        total varchar(30),
//        PRIMARY KEY (cusID)
//        )ENGINE = INNODB;
//
//        INSERT INTO category VALUES(11, 'Duy Linh');
//        SELECT*FROM category;
