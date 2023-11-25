<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Escolha o Pedido para Atualizar</h2>
    <form action="escolherpedidoid" method="post">
        <label for="pedidoId">ID do Pedido:</label>
        <input type="text" id="pedidoId" name="pedidoId" required>
        <input type="submit" value="Escolher">
    </form>
    <input type="button" onclick="redirecionar('index.jsp')" value="voltar">
    <script>
  		function redirecionar(pagina) {
  			location.href = pagina;
 		}
  	</script>
</body>
</html>