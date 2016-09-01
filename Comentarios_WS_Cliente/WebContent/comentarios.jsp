<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comentarios</title>
</head>
<body>
	<h1>Comentarios</h1>
	<form action="comentarios" method="post">
		<label for="titulo">T�tulo</label><br /> <input type="text"
			name="titulo" /><br /> <label for="assunto">Assunto</label><br />
		<input type="text" name="assunto" /><br /> <label for="avaliacao">Avalia��o</label><br />
		<input type="text" name="avaliacao" /><br /> <input type="submit" />
	</form>
	<div>
		<c:if test="${comentarios != null}">
			<table>
				<tr>
					<th>Assunto</th>
					<th>Comentario</th>
					<th>Avalia��o</th>
				</tr>
				<c:forEach var="comentario" items="${comentarios}">
					<tr>
						<td>${comenario.getAssunto()}</td>
						<td>${comenario.getComentario()}</td>
						<td>${comenario.getAvaiacao()}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>