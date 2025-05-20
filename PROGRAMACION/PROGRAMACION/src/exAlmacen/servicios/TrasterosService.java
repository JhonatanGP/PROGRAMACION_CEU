package exAlmacen.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import exAlmacen.modelo.Trastero;

public class TrasterosService extends OpenConnection {

	public void actualizarAlquiler(Trastero t) throws SQLException, TrasteroServiceException, TrasteroEstadoException {
		String sql = "UPDATE TRASTEROS SET PRECIO_METRO_DIA = ?, DNI_ALQUILER = ?, FECHA_INICIO_ALQUILER = ?, "
				+ "FECHA_FIN_ALQUILER = ?, ALQUILADO = 'S'  WHERE COD_TRASTERO = ?";
		
		try (Connection conn = getNewConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			try {			
			pstmt.setBigDecimal(1, t.getPrecio());
			pstmt.setString(2, t.getDni());
			pstmt.setDate(3, Date.valueOf(t.getF_ini()));
			pstmt.setDate(4, Date.valueOf(t.getF_fin()));
			pstmt.setString(5,t.getCodigo());

			System.out.println(sql);
			pstmt.executeUpdate();
			}catch (SQLException e) {
				throw new TrasteroEstadoException("No se ha encontrado trastero con el código indicado");	
			}
			
		}catch(SQLException e) {
			 e.printStackTrace();
	            throw new TrasteroServiceException("Error actualizando en BBDD");
		}
	}
	public void crearTrastero(Trastero t) throws SQLException, TrasteroServiceException{
		String sql = "INSERT INTO TRASTEROS (COD_TRASTERO, METROS, ALQUILADO) VALUES(?, ?, N)";
		try (Connection conn = getNewConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, t.getCodigo());
			pstmt.setInt(2, t.getMetro());

			System.out.println(sql);
			pstmt.execute();
		}catch(SQLException e) {
            throw new TrasteroServiceException("Error insertando en BBDD");

		}
	}
	
}
