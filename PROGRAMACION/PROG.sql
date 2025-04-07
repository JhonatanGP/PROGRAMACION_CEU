CREATE TABLE personas (
 DNI varchar2(50) NOT NULL,
 NOMBRE varchar2(50) NOT NULL,
 APELLIDOS varchar2(100) NOT NULL,
 FECHA_NACIMIENTO DATE DEFAULT NULL,
 PRIMARY KEY (DNI)
); 

INSERT INTO personas values('12345678','Jhonatan','Guzman','12/09/1998');
INSERT INTO personas values('87654321','Antonio','Lopez','20/02/1995');
