import java.sql.*;
class Prac{
    public static void main(String [] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager
        .getConnection("jdbc:mysql://localhost:3306/prac", "root", "root");
        Statement st = con.createStatement();
        int n  = st.executeUpdate("create table emp(id number, ename varchar(10), )");
        System.out.println(n);

    }
    public static void h(){

    }
}
