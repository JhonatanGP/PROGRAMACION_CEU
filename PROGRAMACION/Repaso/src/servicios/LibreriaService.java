package servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Libro;

public class LibreriaService {
	
	private OpenConnection openConn;

	public LibreriaService() {
		openConn = new OpenConnection();
		System.out.println("Conexión establecida.");
	}
	
	public void insertarLibroNuevo(Libro libro) throws LibroException, SQLException{
		String sql = "INSERT INTO libros VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, libro.getIsbn());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio());
			
			stmt.execute();

			}
		catch (SQLException e) {
			throw new LibroException(e.getMessage());
		}
	}
	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws LibroException, SQLException{
		String sql = "UPDATE libros SET precio = ? WHERE isbn = ?";		
		try (Connection conn = openConn.getNewConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.setString(2, libro.getIsbn());

			Boolean actualizado = stmt.execute();
			return actualizado;
		
		}catch (SQLException e) {
			throw new LibroException("Error.");
		}
	}
	
	
	
	}





