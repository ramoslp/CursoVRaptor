<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Inserir dados</title>
	</head>
	<body>

		<form method="post" action="resultadoimc">
		
			<label>Sexo:</label>
			<br/><br/>
			<input type="text" name="sexo">
			<br/><br/>
		    <label>Peso:</label>
		    <br/><br/>
		    <input type="text" name="peso">
		    <br/><br/>
		    <label>Altura:</label>
		    <br/><br/>
		    <input type="text" name="altura">
		    <br/><br/>
		    <input type="submit" value="Enviar">
	    
		</form>
	</body>
</html>