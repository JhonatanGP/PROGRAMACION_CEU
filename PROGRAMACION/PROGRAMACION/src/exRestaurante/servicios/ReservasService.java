package exRestaurante.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import exRestaurante.modelo.Reserva;
import exRestaurante.modelo.ReservasException;
import exRestaurante.modelo.Restaurante;

public class ReservasService extends OpenConnection {

	public void insertarReservas(Restaurante rest) throws SQLException, ReservasException {
		String sql = "INSERT INTO RESERVAS VALUES (?,?,?,?)";

		try (Connection conn = getNewConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)){
			conn.setAutoCommit(false);

			try {
				for (Map.Entry<String, Reserva> entry : rest.getMapReserva().entrySet()) {
					String key = entry.getKey();
					Reserva val = entry.getValue();

					pstmt.setString(1, key);// NOMBRE
					pstmt.setDate(2, Date.valueOf(val.getFecha())); // FECHA
					pstmt.setInt(3, val.getN_personas());// NUM_PERSONAS
					pstmt.setString(4, val.getConfirmada() ? "CONFIRMADA" : "NO CONFIRMADA");// ESTADO
					pstmt.execute();
				}
				conn.commit();

			} catch (SQLException e) {
				conn.rollback();
				System.out.println(e.getMessage());
				throw new ReservasException();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}
	public void borrarReservas(String nombre) throws SQLException {
		String sql = "DELETE FROM RESERVAS WHERE NOMBRE_CLIENTE = ?";
		try(Connection conn = getNewConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, nombre);
			pstmt.execute();
			
		}catch (SQLException e) {
			System.out.println("No se encuentra ese dni");
		}
	}
}
