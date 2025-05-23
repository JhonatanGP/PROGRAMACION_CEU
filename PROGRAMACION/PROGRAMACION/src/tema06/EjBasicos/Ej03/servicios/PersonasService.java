package tema06.EjBasicos.Ej03.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema06.EjBasicos.Ej03.modelo.Persona;

public class PersonasService {

	private OpenConnection openConn;
	
	public PersonasService() {
		openConn = new OpenConnection();
		System.out.println("Conexión establecida.");
	}
	
	public Persona consultarPersona(String dni) throws SQLException{
		ResultSet rs = null;		
		try (Connection conn = openConn.getNewConnection();
				Statement stmt = conn.createStatement()){
						
			String sql = "SELECT * FROM PERSONAS WHERE DNI = '" + dni + "'";
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				
				String apellidos = rs.getString("APELLIDOS");
				p.setApellidos(apellidos);
				p.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				//return getPersonaFromResultSet(rs);		
				return p;
			}else {
				return null;
			}
			
		}finally {
			System.out.println("");
		}
		
	}
	public List<Persona> buscarPersona(String cadena) throws SQLException{
		List<Persona> lista = new ArrayList<>();
		try (Connection conn = openConn.getNewConnection();
				Statement stmt = conn.createStatement()){
						
			String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + cadena + "%' OR APELLIDOS LIKE '%" + cadena + "%'" ;
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				
				String apellidos = rs.getString("APELLIDOS");
				p.setApellidos(apellidos);
				p.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				lista.add(p);	
			}return lista;	
		}
		
	}
	public void insertarPersona(Persona p) throws SQLException{
		String sql = "INSERT INTO PERSONAS VALUES (?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFechaNac()));

			System.out.println(sql);
			stmt.execute();
		}
		
	}
	
}
