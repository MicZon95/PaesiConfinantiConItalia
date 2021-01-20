<%@page import="it.paesiconfinanticonitalia.model.Nazione"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Bravo!</h3>
<% 
	Nazione nazioneDaVisualizzare = (Nazione)request.getAttribute("nazioneInserita");
%>
Hai inserito: nazione <%= nazioneDaVisualizzare.getNome() %> con capitale <%= nazioneDaVisualizzare.getCapitale() %>

<br>
<br>

<a href="https://it.wikipedia.org/wiki/Italia" style="cursor:pointer;">Se vuoi sapere di più sull'Italia</a>

<br>
<br>

<img src="imgages/tumblr_ox567sGwZm1w9m4m8o1_500.jpg" style="display: block;">
</body>
</html>