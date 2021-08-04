package com.company;
import java.sql.*;
public class MySql {

    static final String PASS = "your password for mysql";
    static final String DB_URL = "jdbc:mysql://localhost:3306/culturalTags";
    static final String USER = "root";
    private String INSERT_USERS_SQL = "INSERT INTO team_record" + " (teamA, teamB, word, guesser, date) VALUES " + " (?, ?, ?, ?, ?)";

    // Open a connection
    public void db(String win , String lose, String word, String guesser,Date date) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement myStmt = conn.prepareStatement(INSERT_USERS_SQL);

                myStmt.setString(1,win);
                myStmt.setString(2,lose);
                myStmt.setString(3,word);
                myStmt.setString(4,guesser);
                myStmt.setString(5,String.valueOf(date));

                myStmt.executeUpdate();
                System.out.println("saving results ...");
                conn.close();
    }
}
