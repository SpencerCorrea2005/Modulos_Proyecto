/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.hello_spring;

import com.mycoffeeshop.spring.dao.api.TablaUsuarioDaoAPI;
import com.mycoffeeshop.spring.dao.impl.TablaUsuarioDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author USUARIO PC
 */
public class Hello_Spring {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("file:src/main/java/com/mycoffeeshop/spring/hello_spring/Usuario_Spring.java");
        TablaUsuarioDaoAPI tablaUsuarioDaoAPI = applicationContext.getBean(TablaUsuarioDaoImpl.class);
        
        TablaUsuario tablausuario = new TablaUsuario();
        tablausuario.setNumDocIdentidad(1034578142);
        tablausuario.setTipoDocIdentidad("Cedula de Ciudadania");
        tablausuario.setNombreUsuario("Carlos");
        tablausuario.setApellidoUsuario("Orozco");
        tablausuario.setTelefono("3120254875");
        
        tablaUsuarioDaoAPI.guardar(tablausuario);
    }
    
}
