<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="client" class="beans.ClientBeans" scope="session"></jsp:useBean>
</head>
<body>
 
 Nom:<%= client.getNom()%><BR>
Prenom:	<%= client.getPrenom()%><BR>
Adresse:<%= client.getAdresse() %>	<BR>
Numero	: <%=client.getNumero()%>
Email	: <%=client.getEmail()%>
</body>
</html>