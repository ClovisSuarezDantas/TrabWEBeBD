package Conecta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarPedidos")
public class listarPedidos extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<pedido> pedidos = new ArrayList<>();

	    try (Connection conexao = conecta.getConnection();
	         PreparedStatement prs = conexao.prepareStatement("SELECT * FROM pedidos.pedido");
	         ResultSet resultSet = prs.executeQuery()) {

	        while (resultSet.next()) {
	            pedido pedido = new pedido();
	            pedido.setId(resultSet.getInt("id"));
	            pedido.setData(resultSet.getString("data"));
	            pedido.setEntrada(resultSet.getString("entrada"));
	            pedido.setPrincipal(resultSet.getString("principal"));
	            pedido.setSobremesa(resultSet.getString("sobremesa"));

	            pedidos.add(pedido);
	        }

	        request.setAttribute("pedidos", pedidos);
	        request.getRequestDispatcher("/indexListar.jsp").forward(request, response);

	    } catch (SQLException e) {
	        throw new ServletException("Erro ao listar os pedidos", e);
	    }
	}
}