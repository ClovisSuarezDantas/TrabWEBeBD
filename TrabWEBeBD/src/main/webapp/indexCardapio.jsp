<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>

<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: bisque;
}

header {
	background-color: crimson;
	color: gold;
	text-align: center;
	padding: 20px 0;
}

.container {
	max-width: 600px;
	margin: auto;
	margin-top:40px;
	background-color: whitesmoke;
	border-radius: 10px;
	padding-left: 10px;
	padding-top: 1px;
	padding-bottom: 5px;
}

.pratos {
	margin-bottom: 20px;
}
</style>

</head>
<body>
	
<form action="PedidoServlet" method="post">
	<header>
		<h1>Faça seu pedido</h1>
	</header>

	<div class="container">
		<section class="pratos">
			<h2>Entrada</h2>
			<input type="radio" name="entrada" value="batata">Batata frita R$ 18,00 <br> 
			<input type="radio" name="entrada" value="bolinhofeijao">Bolinho de Feijoada(6und) R$ 22,00<br> 
			<input type="radio" name="entrada" value="iscafrango">Isca de Frango(12und) R$ 30,00
		</section>

		<section class="pratos">
			<hr>
			<h2>Pratos principais</h2>
			<input type="radio" name="principal" value="feijoada">Feijoada(500g) R$ 39,90<br> 
			<input type="radio" name="principal" value="bifeacebo">Bife acebolado R$ 29,90<br> 
			<input type="radio" name="principal" value="filedefrango">Filé de Frango R$ 24,90<br> 
			<input type="radio" name="principal" value="filedepeixef">Filé de Peixe Frito R$ 33,90<br> 
			<input type="radio" name="principal" value="figadoacebolado">Figado acebolado R$ 19,90
		</section>

		<section class="pratos">
			<hr>
			<h2>Sobremesas</h2>
			<input type="radio" name="sobremesa" value="petitgateu">Petit gateau R$ 21,90<br> 
			<input type="radio" name="sobremesa" value="pudim">Pudim de leite R$ 15,90<br> 
			<input type="radio" name="sobremesa" value="brownie">Brownie R$ 10,90
		</section>

		<input type="submit">
		<input type="button" onclick="redirecionar('index.jsp')" value="voltar">
		</div>
	</form>
	
	
    <script>
  		function redirecionar(pagina) {
  			location.href = pagina;
 		}
  	</script>

</body>
</html>