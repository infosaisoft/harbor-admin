<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Harbor</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- css -->
<link rel="stylesheet" href="<c:url value="assets/plugins/bootstrap/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="assets/plugins/font-awesome/css/font-awesome.min.css"/>">
<link rel="stylesheet" href="<c:url value="assets/css/style.css"/>">

<!-- jQuery-->
<script src="<c:url value="assets/js/jquery.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="assets/plugins/bootstrap/js/popper.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="assets/plugins/bootstrap/js/bootstrap.min.js"/>" type="text/javascript"></script>

</head>
<body id="id_body">
	<section id="header"><tiles:insertAttribute name="header"/></section>
	<section id="content"><tiles:insertAttribute name="body"/></section>
	<footer><tiles:insertAttribute name="footer"/></footer>
	
	<script type="text/javascript" src="<c:url value="/assets/js/custom.js"/>"></script>
</body>
</html>