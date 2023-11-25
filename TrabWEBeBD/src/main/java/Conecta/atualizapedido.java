package Conecta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/atualizapedido")
public class atualizapedido extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pedidoId = request.getParameter("pedidoId");
        String entrada = request.getParameter("entrada");
        String principal = request.getParameter("principal");
        String sobremesa = request.getParameter("sobremesa");

        try (Connection conexao = conecta.getConnection()) {
            String sql = "UPDATE pedidos.pedido SET entrada = ?, principal = ?, sobremesa = ? WHERE id = ?";
            try (PreparedStatement prs = conexao.prepareStatement(sql)) {
                prs.setString(1, entrada);
                prs.setString(2, principal);
                prs.setString(3, sobremesa);
                prs.setInt(4, Integer.parseInt(pedidoId));
                prs.executeUpdate();
            }
            response.sendRedirect("index.jsp");
        } catch (SQLException e) {
            throw new ServletException("Erro ao atualizar o pedido", e);
        }
    }
}