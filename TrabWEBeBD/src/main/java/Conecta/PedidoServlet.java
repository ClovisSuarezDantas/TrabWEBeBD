package Conecta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PedidoServlet")
public class PedidoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String entrada 	 = request.getParameter("entrada");
		String principal = request.getParameter("principal");
		String sobremesa = request.getParameter("sobremesa");

		try(Connection conexao = conecta.getConnection()){
					
			String sql = "INSERT INTO pedidos.pedido (data, entrada, principal, sobremesa) VALUES (?, ?, ?, ?)";
			try (PreparedStatement prs = conexao.prepareStatement(sql)) {
				
				prs.setDate	 (1, new Date(System.currentTimeMillis()));
				prs.setString(2, entrada);
				prs.setString(3, principal);
				prs.setString(4, sobremesa);
		
				prs.executeUpdate();

				response.sendRedirect("index.jsp");
			}
			catch (SQLException e) {
				throw new ServletException("Erro durante a inserção no banco de dados", e);
			}
		}
		catch (SQLException e) {
            throw new ServletException("Erro ao obter conexão com o banco de dados", e);
        }
	}
}