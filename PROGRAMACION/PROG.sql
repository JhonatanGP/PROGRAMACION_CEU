drop table personas cascade constraints;
CREATE TABLE personas (
 DNI varchar2(50) NOT NULL,
 NOMBRE varchar2(50) NOT NULL,
 APELLIDOS varchar2(100) NOT NULL,
 FECHA_NACIMIENTO DATE DEFAULT NULL,
 PRIMARY KEY (DNI)
); 

INSERT INTO personas values('12345678','Jhonatan','Guzman','12/09/1998');
INSERT INTO personas values('87654321','Antonio','Lopez','20/02/1995');
commit;
--commit; Para guardar los datos.
select * from personas;
--12/05/2025
drop table personas cascade constraints;
CREATE TABLE productos_gourmet (
 id NUMBER PRIMARY KEY,
 nombre VARCHAR2(100) NOT NULL,
 tipo VARCHAR2(50) NOT NULL,
 precio NUMBER(10,2) NOT NULL,
 disponible NUMBER(1) NOT NULL
);

-- 15/05/2025
drop table personas cascade constraints;
CREATE TABLE libros (
 ISBN varchar2(50) NOT NULL,
 TITULO varchar2(50) NOT NULL,
 AUTOR varchar2(50) NOT NULL,
 PRECIO NUMERIC(20,6) NOT NULL,
 PRIMARY KEY (ISBN)
); 

drop table reservas cascade constraints;
drop table trasteros cascade constraints;
