<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
        <meta name="viewport" content="width=device-width">
    	<title>Интернет магазин @Galina-Klubok Nitok вязанные изделия!</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    	<link media="screen" rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
    <header><h1>@Galina_KlubokNitok</h1></header>




    <main>
        <h1 style="color:green;font-size:20pt">
            <p>Hello <%= request.getRemoteHost() %></p>
            <%= request.getParameter("from") %>
            <%= new java.util.Date() %>
        </h1>

        <%= request.getAttribute("product") %>
    </main>




</body>
</html>