/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private String sqlGetAllYears = "SELECT years FROM apometre";
    private Connection conn;

    public ArrayList<Integer> getYears() {
        ArrayList<Integer> years = null;
        ResultSet rs = null;
        Statement stmt = null;

     
        return years;
    }
}
