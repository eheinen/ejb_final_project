<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comentarios</title>
</head>
<body>
<h1>Comentarios</h1>
<form action="comentarios" method="post">
<label for="titulo" >T�tulo</label><br/>
<input type="text"  name="titulo" /><br/>
<label for="assunto" >Assunto</label><br/>
<input type="text"  name="assunto" /><br/>
<label for="avaliacao" >Avalia��o</label><br/>
<input type="text"  name="avaliacao" /><br/>
<input type="submit"/>
</form>
</body>
</html>