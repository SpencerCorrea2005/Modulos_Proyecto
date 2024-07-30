-- Creacion de la base de datos cafeteria_dataBase

CREATE DATABASE cafeteria_dataBase;

USE cafeteria_database;

-- A continuación se van a crear cada una de las tablas de la base de datos

CREATE TABLE Usuario (
NumDocumentoID INT PRIMARY KEY,
NombreUsuario VARCHAR(30) NOT NULL,
ApellidosUsuario VARCHAR(60) NOT NULL,
TipoDocumentoID VARCHAR(30) NOT NULL,
Telefono VARCHAR(15) NOT NULL);

CREATE TABLE DomicilioUsuario (
CodigoDireccion INT PRIMARY KEY,
NumeroCalle VARCHAR(20) NOT NULL,
NumeroCarrera VARCHAR(20) NOT NULL,
NumeroPuerta VARCHAR(20) NOT NULL,
Barrio VARCHAR(50) NOT NULL,
Ciudad VARCHAR(50) NOT NULL,
Departamento VARCHAR(30) NOT NULL,
FOREIGN KEY (CodigoDireccion) REFERENCES Usuario(NumDocumentoID) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE);

CREATE TABLE Autenticacion (
CodigoAutenticacion INT PRIMARY KEY,
CorreoElectronico VARCHAR(150) NOT NULL UNIQUE,
Contrasenya VARCHAR(30) NOT NULL,
FOREIGN KEY (CodigoAutenticacion) REFERENCES Usuario(NumDocumentoID) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE);
    
CREATE TABLE Factura (
ID_Factura BIGINT PRIMARY KEY AUTO_INCREMENT,
TotalProductos INT NOT NULL,
CantidadPagada INT NOT NULL,
DomicilioEmpresa VARCHAR(150) NOT NULL,
NumDocumentoID INT NOT NULL UNIQUE,
Fecha_Facturacion DATETIME NOT NULL,
FOREIGN KEY (NumDocumentoID) REFERENCES Usuario(NumDocumentoID) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE);
    
CREATE TABLE FormaPago (
CodigoPago BIGINT PRIMARY KEY AUTO_INCREMENT,
TipoPago VARCHAR(10) NOT NULL,
FOREIGN KEY (CodigoPago) REFERENCES Factura(ID_Factura)
	ON DELETE CASCADE 
	ON UPDATE CASCADE);

CREATE TABLE TipoProducto (
CodTipoProducto TINYINT PRIMARY KEY,
Nombre TINYTEXT NOT NULL);

CREATE TABLE DatosProductos (
ID_ProductosCafeteros TINYINT PRIMARY KEY,
NombreProducto VARCHAR(50) NOT NULL,
Descripcion VARCHAR(1000) NOT NULL,
PrecioProducto INT NOT NULL,
ID_TipoProducto TINYINT NOT NULL,
FOREIGN KEY (ID_TipoProducto) REFERENCES TipoProducto(CodTipoProducto)
	ON DELETE CASCADE 
	ON UPDATE CASCADE);
    
CREATE TABLE Detalles_Factura (
Codigo_ProductosCafeteros TINYINT NOT NULL,
Codigo_Factura BIGINT,
PRIMARY KEY (Codigo_ProductosCafeteros, Codigo_Factura),
FOREIGN KEY (Codigo_ProductosCafeteros) REFERENCES DatosProductos(ID_ProductosCafeteros)
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
FOREIGN KEY (Codigo_Factura) REFERENCES Factura(ID_Factura)
	ON DELETE CASCADE 
	ON UPDATE CASCADE);
    
-- Con esto ya estarían creadas las 8 tablas de la base de datos del proyecto
-- de desarrollo de software, junto con sus respectivos atributos y restricciones
