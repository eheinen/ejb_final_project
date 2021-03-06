<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<input type="text" name="assunto" /><br /> 
		<label for="avaliacao">Avalia��o</label><br />
		<input type="text" name="avaliacao" /><br /> 
		<input type="submit" value="Postar"/>
	</form>
	<div>
		<c:if test="${comentarios != null}">
			<table>
				<tr>
					<th>T�tulo</th>
					<th>Assunto</th>
					<th>Avalia��o</th>
					<th>Data</th>
				</tr>
				<c:forEach var="comentario" items="${comentarios}">
					<tr>
						<td>${comentario.titulo}</td>
						<td>${comentario.assunto}</td>
						<td>${comentario.avaliacao}</td>
						<td><fmt:formatDate type="date" value="${comentario.data}" /></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>