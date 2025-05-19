package tema06.EjBasicos.Ej01casa.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tema06.EjBasicos.Ej01casa.modelo.Persona;

public class PersonasService extends OpenConnection{
	
	public Persona consultarPersona(String dni)  throws SQLException {
	    //ResultSet rs = null;
		String sql = "SELECT * FROM PERSONAS WHERE DNI = ?";

		try (Connection conn = getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
	        stmt.setString(1, dni);  // Parámetro seguro

	        ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				Persona p = new Persona();
				p.setDni(dni);
				String nombre = rs.getString("NOMBRE");
				p.setNombre(nombre);
				
				String apellidos = rs.getString("APELLIDOS");
				p.setApellidos(apellidos);
				p.setFecha_nac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				return p;
			} else {
				return null;
			}

		}catch(SQLException e) {
			
		}
		return null;		
	}
	
	public List<Persona> buscarPersonas(String filtro) throws SQLException{
		
		List<Persona> lista = new ArrayList<>();
		String sql = "SELECT * FROM PERSONAS WHERE NOMBRE LIKE '%" + filtro + "%' OR APELLIDOS LIKE '%" + filtro + "%'" ;
		System.out.println(sql);
		
		try (Connection conn = getNewConnection();
				Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()) {
				Persona p = new Persona();
				p.setNombre(rs.getString("NOMBRE"));
				p.setDni(rs.getString("DNI"));
				p.setApellidos(rs.getString("APELLIDOS"));
				p.setFecha_nac(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				lista.add(p);	
			}return lista;	
		}
		
	}
	
	public void insertarPersona(Persona p) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try(Connection conn = getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFecha_nac()));
			
			System.out.println(sql);
			stmt.execute();
		}
		
	}
	
	public void actualizarPersona(Persona p) throws SQLException {
		String sql = "UPDATE PERSONAS SET NOMBRE = ?, APELLIDOS = ?, FECHA_NAC = ? WHERE DNI = ?";
		try(Connection conn = getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, p.getNombre());
			stmt.setString(2, p.getApellidos());
			stmt.setDate(3, Date.valueOf(p.getFecha_nac()));
			stmt.setString(4, p.getDni());

			System.out.println(sql);
			stmt.executeUpdate();
			 
		}
	}
	
	public void borrarPersona(String dni) throws SQLException {
		String sql = "DELETE FROM PERSONAS WHERE DNI = ?";
		try (Connection conn = getNewConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, dni);
			System.out.println(sql);
			stmt.execute();
		}
	}

	public void insertarPersonas(List<Persona> lista) throws SQLException {
		String sql = "INSERT INTO PERSONAS VALUES (?,?,?,?)";
		try(Connection conn = getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			conn.setAutoCommit(false);
			
			stmt.setString(1, lista.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellidos());
			stmt.setDate(4, Date.valueOf(p.getFecha_nac()));
			
			System.out.println(sql);
			stmt.execute();
		}
		
	}
	
	
	
	
	
	
	
	
	

}
