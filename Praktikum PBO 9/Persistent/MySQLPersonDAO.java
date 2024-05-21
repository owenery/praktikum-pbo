/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */

/*
Nama        : David Nugroho
NIM         : 24060122130074
File        : MySQLPersonDAO
Deskripsi   : Implementasi person DAO untuk MySQL
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //Membuat koneksi, namadb, user, password menyeduaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/PBO","root", "5b9e4811");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('"+name+"')";
        System.out.println(query);
        java.sql.Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();    
    }
}
