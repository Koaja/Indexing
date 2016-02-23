package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Koaja
 */
public class Model {

    private final String sqlGetAllYears = "SELECT * FROM indexers";
    private final String sqlGetAllMonths = "SELECT * FROM indexers";
    private Connection conn = mySQLConnect.ConnectDB();

    public ArrayList<Integer> getYears() {
        ArrayList<Integer> years = null;

        ResultSet rs = null;
        Statement stmt = null;

        try {
            years = new ArrayList<>();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlGetAllYears);
            while (rs.next()) {
                years.add(Integer.parseInt(rs.getString("year")));
            }
        } catch (SQLException ex) {

        }

        return years;
    }

    public ArrayList<String> getMonths() {
        ArrayList<String> months = null;
        ResultSet rs = null;
        Statement stmt = null;

        try {
            months = new ArrayList<>();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlGetAllYears);
            while (rs.next()) {
                months.add(rs.getString("month"));
            }
        } catch (SQLException ex) {

        }

        return months;
    }
}
