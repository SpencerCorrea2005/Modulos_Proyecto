/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO PC
 */
public class RecibeDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre_usuario = request.getParameter("nombre_usuario");
        String apellidos_usuario = request.getParameter("apellidos_usuario");
        String tipo_docID = request.getParameter("tipo_documento");
        String num_docID = request.getParameter("num_documento");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        String domicilio = request.getParameter("domicilio");
        
        System.out.println("El nombre del usuario es: " + nombre_usuario);
        System.out.println("Los apellidos del usuario son: " + apellidos_usuario);
        System.out.println("El tipo de documento de identidad es: " + tipo_docID);
        System.out.println("El numero de documento de identidad es: " + num_docID);
        System.out.println("El telefono es: " + telefono);
        System.out.println("El correo es: " + correo);
        System.out.println("La contrasena es: " + contrasena);
        System.out.println("La direccion de domicilio es: " + domicilio);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecibeDatos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Los datos han sido registrados correctamente </h1>");
            out.println("</body>");
            out.println("</html>");
        }
               
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}