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
import model.Vehicule;

/**
 *
 * @author Kanto
 */
public class VehiculeDAO {
    Connexion conn = new Connexion();

    public ArrayList<Vehicule> listeVehicule() throws Exception {
        ArrayList<Vehicule> list = null;
        Connection connex = null;
        Statement stmt = null;
        ResultSet req = null;
        String sql = null;
        try {
            connex = conn.getConnexion();
            stmt = connex.createStatement();
            sql = "select * from vehicule";
            req = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (req.next()) {
                Vehicule v= new Vehicule();
                v.setId(req.getInt("id"));
                v.setIdmarque(req.getInt("idmarque"));
                v.setIdmodele(req.getInt("idmodele"));
                v.setIdtype(req.getInt("idtype"));
                v.setNumerovehicule(req.getString("numerovehicule"));
                list.add(v);
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
