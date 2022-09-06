
package com.In5bmGrupo6.models.dao;

/**
 *
 * @author Luis Carlos Pérez
 * @date 3/09/2022
 * @time 09:54:47
 * 
 *Código técnico: IN5BM
 *
 */

import com.In5bmGrupo6.models.domain.Suscripciones;
import com.In5bmGrupo6.models.idao.ISuscripcionDAO;
import com.In5bmGrupo6.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class SuscripcionDaoImpl implements ISuscripcionDAO{
    
    private static final String SQL_SELECT = "select id_suscripcion, tipo_suscripcion from suscripciones";
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Suscripciones suscripcion = null;
    private List<Suscripciones> listaSuscripciones = new ArrayList<>();
    
    @Override
    public List<Suscripciones> getAll() {
        try {
            con = Conexion.getConnection();
            pstmt = con.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                suscripcion = new Suscripciones(rs.getInt("id_suscripcion"), rs.getString("tipo_suscripcion"));
                listaSuscripciones.add(suscripcion);
            }
        } catch (SQLException e){
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(pstmt);
            Conexion.close(con);
        }
        return listaSuscripciones;
    }

    @Override
    public boolean add(Suscripciones suscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Suscripciones suscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Suscripciones suscripcion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
