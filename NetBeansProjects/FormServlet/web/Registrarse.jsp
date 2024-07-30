<%-- 
    Document   : index
    Created on : 10/07/2024, 2:38:38 p. m.
    Author     : USUARIO PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> Registrarse | Necoffee </title>
        <style type="text/css">
            body {
                text-align: center;
                background-color: #E3D5CA;
                color:black;
                margin: 20px;
                border: #4e311a;
                font-size:23px;
            }

            form {
                
                display:inline-block;
                padding-bottom: 50px;
            }

            h1 {
                text-align: center;
                background-color: #F5EBE0;
                color:maroon;
                font-size: 45px;
                border-style: solid;
                font-family: Arial, Helvetica, sans-serif;
            }

            h2 {
                text-align: center;
                background-color: #F5EBE0;
                color:black;
                border-style:groove;
                font-size: 30px;
                font-style: italic;
                font-family: Arial, Helvetica, sans-serif;
            }

            h3 {
                text-align:justify;
                background-color: #F5EBE0;
                color:black;
                border: none;
                font-family: Arial, Helvetica, sans-serif;
                font-style: italic;
            }

            button {
                margin-left: 125px;
                margin-top: 20px;
                width: auto;
                height: auto;
                cursor: pointer;
            }

            a {
                color: black;
            }
        </style>
        
    </head>
    
    <body>
        <header>
        <h1> ¡Regístrate en la cafetería para poder iniciar a realizar tus compras! </h1>
        <h2> "Una vez rellenes los datos que te sean solicitados, tendrás acceso a todo el catálogo de productos disponibles en la cafetería" </h2>
        <h3> Digita los datos que te sean solicitados a continuación.</h3>
        </header>
        
    <br> 
    <hr>
    <br>
    
    <br>
    <br>
            <br><br>
        
            <form action="RecibeDatos" target="_self" autocomplete="on" method="POST">
        <span> <label for="nombre_usuario">Nombres:</label> <br> </span>
        <span> <input type="text" id="nombre_usuario" name="nombre_usuario" required> </span> <br> <br>
        
        <span> <label for="nombre_usuario">Apellidos:</label> <br> </span>
        <span> <input type="text" id="apellidos_usuario" name="apellidos_usuario" required> </span> <br> <br>

        <span> <label for="tipo_documento">Tipo de documento de identidad:</label> <br> </span>
        <span> <input type="text" id="tipo_documento" name="tipo_documento" required> </span> <br> <br>

        <span> <label for="num_documento">Número del documento de identidad:</label> <br> </span>
        <span> <input type="text" id="num_documento" name="num_documento" required> </span> <br> <br>

        <span><label for="telefono">Teléfono de contacto:</label> <br> </span>
        <span> <input type="text" id="telefono" name="telefono" required> <br> <br> </span>

        <span> <label for="correo">Correo electrónico:</label> <br> </span>
        <span> <input type="email" id="correo" name="correo" required> <br> <br> </span>

        <span> <label for="contrasena">Contraseña:</label> <br> </span>
        <span> <input type="password" id="contrasena" name="contrasena" required> <br> <br> </span>

        <span> <label for="domicilio">Domicilio:</label> <br> </span>
        <span> <input type="text" id="domicilio" name="domicilio" required> <br> <br> <br> </span>
            <br>
        
            <button type="submit"> Enviar </button>
    </form>
    </body>
</html>
            
