package Conecta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excluipedido")
public class excluipedido extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pedidoId = request.getParameter("pedidoId");

        try (Connection conexao = conecta.getConnection()) {
            String sqlVerifica = "SELECT COUNT(*) FROM pedidos.pedido WHERE id = ?";
            
            try (PreparedStatement psVerifica = conexao.prepareStatement(sqlVerifica)) {
                psVerifica.setInt(1, Integer.parseInt(pedidoId));
                ResultSet rs = psVerifica.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    String sql = "DELETE FROM pedidos.pedido WHERE id = ?";
                    try (PreparedStatement psExclui = conexao.prepareStatement(sql)) {
                        psExclui.setInt(1, Integer.parseInt(pedidoId));
                        psExclui.executeUpdate();
                        response.getWriter().println("Pedido excluído com sucesso.");
                        response.sendRedirect("index.jsp");
                    }
                } else {
                    response.getWriter().println("Pedido com ID " + pedidoId + " não encontrado.");
                }
            }
            
        } catch (SQLException | NumberFormatException e) {
            throw new ServletException("Erro ao excluir o pedido", e);
        }
    }
}