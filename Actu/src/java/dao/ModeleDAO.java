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
import model.Modele;

/**
 *
 * @author Kanto
 */
public class ModeleDAO {

    Connexion conn = new Connexion();

    public ArrayList<Modele> listeModele() throws Exception {
        ArrayList<Modele> list = null;
        Connection connex = null;
        Statement stmt = null;
        ResultSet req = null;
        String sql = null;
        try {
            connex = conn.getConnexion();
            stmt = connex.createStatement();
            sql = "select * from modele";
            req = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (req.next()) {
                Modele m = new Modele();
                m.setId(req.getInt("id"));
                m.setModele(req.getString("modele"));
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
