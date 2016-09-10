<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="registra">
		
			<label>Nome:</label>
			<br/><br/>
			<input type="text" name="pessoa.nome">
			<br/><br/>
			
		    <label>E-mail:</label>
		    <br/><br/>
		    <input type="text" name="pessoa.email">
		    <br/><br/>
		    
		    <label>Senha:</label>
		    <br/><br/>
		    <input type="password" name="pessoa.senha">
		    <br/><br/>
		    
		    <label>Rua:</label>
		    <br/><br/>
		    <input type="text" name="endereco.rua">
		    <br/><br/>
		    
		    <label>CEP:</label>
		    <br/><br/>
		    <input type="text" name="endereco.cep">
		    <br/><br/>
		    
		    <label>Cidade:</label>
		    <br/><br/>
		    <input type="text" name="endereco.cidade">
		    <br/><br/>
		    
		    <label>Bairro:</label>
		    <br/><br/>
		    <input type="text" name="endereco.bairro">
		    <br/><br/>
		    
		    <input type="submit" value="Enviar">
	    
		</form>
	</body>
</html>