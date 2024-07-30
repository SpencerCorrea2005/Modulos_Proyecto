/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycoffeeshop.spring.hello_spring;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author USUARIO PC
 * 
 * Se han importado diversos paquetes provenientes del framework Spring con el
 * objetivo de implementar Spring JDBC para las conexiones a bases de datos.
 * 
 * El concepto de DataSource se refiere a la propia conexión a la base de datos.
 * 
 * Una aplicación JDBC puede establecer una conexión con una fuente de datos 
 * utilizando la interfaz DriverManager de JDBC.
 * 
 * La anotación @Configuration se utiliza en Spring Boot para indicar que 
 * una clase contiene una o más definiciones bean.
 */


@Configuration
@ComponentScan("com.baeldung.jdbc")
public class Usuario_Spring {

    /**
     *
     * @return
     * 
     * La anotación @Bean se utiliza para indicar que esta instancia debe ser 
     * registrada como un bean en el contexto de Spring.
     * 
     * Un Bean es un objeto gestionado por el framework Spring.
     * 
     * Los beans se pueden utilizar para encapsular y proporcionar servicios, 
     * utilidades y funcionalidades a otros componentes de una aplicación.
     */
    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    
    dataSource.setUrl("jdbc:mysql://localhost:3307/cafeteria_database");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
}
