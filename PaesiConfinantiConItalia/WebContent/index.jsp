<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ciao, dimmi una nazione che confina con l'Italia e quale è la sua capitale:</h1>
<form action="CheckPaeseServlet" method="post">
<p>Nazione: </p> <input type="text" name="nazioneInserita" placeholder="Nazione">
<p>Capitale: </p> <input type="text" name="capitaleInserita" placeholder="Capitale">
<br>
<br>
<input type="submit" value="clicca" style="background-color: #4c98af; color: black; border: none; padding: 14px 28px; margin: 4px 2px; cursor: pointer;"> 
</form>
</body>
</html>