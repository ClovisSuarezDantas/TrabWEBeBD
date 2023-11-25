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

@WebServlet("/escolherpedidoid")
public class escolherpedidoid extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pedidoId = request.getParameter("pedidoId");

        try (Connection conexao = conecta.getConnection()) {

            String sql = "SELECT COUNT(*) FROM pedidos.pedido WHERE id = ?";
            try (PreparedStatement prs = conexao.prepareStatement(sql)) {
                prs.setInt(1, Integer.parseInt(pedidoId));
                ResultSet rs = prs.executeQuery();
                if (rs.next() && rs.getInt(1) > 0) {
                    request.getSession().setAttribute("pedidoId", pedidoId);
                    response.sendRedirect("indexAlterarPedido.jsp");
                } 
                else {
                    response.getWriter().println("Pedido com ID " + pedidoId + " não encontrado.");
                }
            }
        } catch (SQLException | NumberFormatException e) {
            throw new ServletException("Erro ao selecionar o pedido", e);
        }
    }
}