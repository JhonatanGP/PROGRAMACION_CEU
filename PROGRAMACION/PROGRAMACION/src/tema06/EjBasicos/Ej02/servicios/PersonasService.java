package tema06.EjBasicos.Ej02.servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema06.EjBasicos.Ej02.modelo.Persona;


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
	public List<Persona> buscarPersona(String filtro) throws SQLException{
		List<Persona> lista = new ArrayList<>();
		String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' OR APELLIDOS LIKE '%" + filtro + "%'" ;
		System.out.println(sql);
		try (Connection conn = openConn.getNewConnection();
				Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFechaNac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				lista.add(p);	
			}return lista;	
		}
		
	}
	
}
