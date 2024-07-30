/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.dao.api;

import com.mycoffeeshop.spring.hello_spring.TablaUsuario;
import java.util.List;

/**
 *
 * @author USUARIO PC
 */
public interface TablaUsuarioDaoAPI {
    
    void guardar(TablaUsuario tablausuario);
    
    List<TablaUsuario> getTablaUsuario();
    
}
