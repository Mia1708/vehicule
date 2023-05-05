/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Marque;

/**
 *
 * @author Kanto
 */
public class MarqueDAO {

    Connexion conn = new Connexion();

    public ArrayList<Marque> listeMarque() throws Exception {
        ArrayList<Marque> list = null;
        Connection connex = null;
        Statement stmt = null;
        ResultSet req = null;
        String sql = null;
        try {
            connex = conn.getConnexion();
            stmt = connex.createStatement();
            sql = "select * from marque";
            req = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (req.next()) {
                Marque m = new Marque();
                m.setId(req.getInt("id"));
                m.setMarque(req.getString("marque"));
                list.add(m);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            stmt.close();
            connex.close();
        }
        return list;
    }
}
