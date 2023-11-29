<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-image: url(img/e4703ec7-f5f0-4d27-ab13-c27f47c4dd67.jpg);
    background-size: cover;
    margin: 0;
    padding: 0;
}

header {
    background-color: crimson;
    color: gold;
    text-align: center;
    font-size:50px;
    padding: 20px 0;
}

.container {
    max-width: 600px;
    margin: auto;
    background-color: whitesmoke;
    margin-top: 100px;
    border-radius: 10px;
    padding-right: 10px;
    padding-left: 10px;
    padding-top: 100px;
    padding-bottom: 5px;
    width: 300px;
    height: 300px;
}

.b{
    font-size: 30px;
    background-color: lightgray;
    border: none;
    cursor: pointer;
    transition: background-color 0.3s;
    border-radius: 5px;
    margin-bottom: 20px;
    margin-left: 50px;
}
.b:hover{
    background-color: gray;
}
</style>
</head>

<body>
    <header>Escolha sua ação</header>
    
    <div class="container">
        <input type="button" onclick="redirecionar('indexCardapio.jsp')"  value="Fazer pedido"   class="b">
        <input type="button" onclick="redirecionar('indexAlterarID.jsp')"   value="Alterar pedido" class="b">
        <input type="button" onclick="redirecionar('indexExcluir.jsp')"   value="Excluir pedido" class="b">
       	<form action="listarPedidos">
       	<input type="submit" value="Listar pedidos" class="b">
       	</form>
    </div>
	
	<script>
  		function redirecionar(pagina) {
  			location.href = pagina;
 		}
  	</script>
</body>
</html>