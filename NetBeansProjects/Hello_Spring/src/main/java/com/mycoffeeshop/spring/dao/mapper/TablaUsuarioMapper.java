/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.dao.mapper;

import com.mycoffeeshop.spring.hello_spring.TablaUsuario;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USUARIO PC
 */
public class TablaUsuarioMapper implements RowMapper<TablaUsuario> {
    
    /**
     *
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    @Override
    public TablaUsuario mapRow(ResultSet rs, int rowNum) throws SQLException {
        TablaUsuario tablausuario = new TablaUsuario();
        
        tablausuario.setNumDocIdentidad(rs.getInt("NumDocumentoID"));
        tablausuario.setTipoDocIdentidad(rs.getString("TipoDocumentoID"));
        tablausuario.setNombreUsuario(rs.getString("NombreUsuario"));
        tablausuario.setApellidoUsuario(rs.getString("ApellidosUsuario"));
        tablausuario.setTelefono(rs.getString("Telefono"));
        
        return tablausuario;
    }
     
}
