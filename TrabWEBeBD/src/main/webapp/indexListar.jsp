<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="Conecta.pedido" %>
<%@ page import="java.util.List" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
    <h2>Lista de Pedidos</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Data</th>
            <th>Entrada</th>
            <th>Prato Principal</th>
            <th>Sobremesa</th>
        </tr>
        <%
            List<pedido> pedidos = (List<pedido>) request.getAttribute("pedidos");
            for (pedido pedido : pedidos) {
        %>
        <tr>
            <td><%= pedido.getId() %></td>
            <td><%= pedido.getData() %></td>
            <td><%= pedido.getEntrada() %></td>
            <td><%= pedido.getPrincipal() %></td>
            <td><%= pedido.getSobremesa() %></td>
        </tr>
        <%
            }
        %>
    </table>
    
    <input type="button" onclick="redirecionar('index.jsp')" value="voltar">
    <script>
  		function redirecionar(pagina) {
  			location.href = pagina;
 		}
  	</script>
</body>
</html>