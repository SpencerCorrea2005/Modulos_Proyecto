/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.dao.impl;

import com.mycoffeeshop.spring.dao.api.TablaUsuarioDaoAPI;
import com.mycoffeeshop.spring.dao.mapper.TablaUsuarioMapper;
import com.mycoffeeshop.spring.hello_spring.TablaUsuario;
import java.sql.Types;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO PC
 * 
 * JdbcTemplate es la API principal que se usará
 * para acceder a la funcionalidad de Spring JDBC
 * 
 * NamedParameterJdbcTemplate es diseñada específicamente para manejar
 * las sentencias SQL
 */

@Repository
public class TablaUsuarioDaoImpl implements TablaUsuarioDaoAPI {
    
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void guardar(TablaUsuario tablausuario) {
        StringBuilder sql = new StringBuilder(100);
        sql.append("INSERT INTO usuario");
        sql.append("VALUES (:NumDocumentoID, :TipoDocumentoID, :NombreUsuario, :ApellidosUsuario, :Telefono)");
        
        MapSqlParameterSource params = new MapSqlParameterSource();
        
        params.addValue("NumDocumentoID", tablausuario.getNumDocIdentidad(), Types.INTEGER);
        params.addValue("TipoDocumentoID", tablausuario.getTipoDocIdentidad(), Types.VARCHAR);
        params.addValue("NombreUsuario", tablausuario.getNombreUsuario(), Types.VARCHAR);
        params.addValue("ApellidosUsuario", tablausuario.getApellidoUsuario(), Types.VARCHAR);
        params.addValue("Telefono", tablausuario.getTelefono(), Types.VARCHAR);
        
        namedParameterJdbcTemplate.update(sql.toString(), params);
        
    }

    @Override
    public List<TablaUsuario> getTablaUsuario() {
       StringBuilder sql = new StringBuilder(100);
       sql.append("SELECT * FROM usuario");
       return jdbcTemplate.query(sql.toString(), new TablaUsuarioMapper());
    }
    
}
