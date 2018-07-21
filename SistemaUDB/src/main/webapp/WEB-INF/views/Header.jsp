<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="appPath" value="${pageContext.request.contextPath}"/>
<%
	String contextPath = request.getContextPath();
	
%>
<!DOCTYPE html>
<html>
	<head>
		<title>.::UNIVERSIDAD DON BOSCO::.</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href='<%=contextPath+"/css/main.css" %>' />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo"  href="<%=contextPath%>/inicio.html">Sistema UDB</a>
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="<%=contextPath%>/inicio.html">Inicio</a></li>
					<li><a href="<%=contextPath%>/estudiante/agregarEstudiante.html">Estudiante</a></li>
					<li><a href="<%=contextPath%>/materia/agregarMateria.html">Materia</a></li>
				</ul>
			</nav>
	