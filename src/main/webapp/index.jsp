<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Интернет магазин @Galina-Klubok Nitok вязанные изделия!</title>
	<link media="screen" rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
    <header>@Galina_KlubokNitok</header>
    <main>
        <%= request.getAttribute("cards") %>
    </main>
    <footer>
    	<div id="contacts">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Error ratione sapiente, cumque dolorem,                            maiores ipsam officiis in quisquam cupiditate recusandae, numquam ipsum sequi! Animi officia                                 consequuntur perspiciatis repellendus voluptatibus provident.
    	</div>
    </footer>
</body>
</html>
