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
        <h1 style="color:green;font-size:20pt">
            <p>Hello <%= request.getRemoteHost() %></p>
            <%= request.getParameter("from") %>
            <%= new java.util.Date() %>
        </h1>
    </main>




    <footer>
    	<div id="contacts">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Error ratione sapiente, cumque dolorem,                            maiores ipsam officiis in quisquam cupiditate recusandae, numquam ipsum sequi! Animi officia                                 consequuntur perspiciatis repellendus voluptatibus provident.Animi officia consequuntur perspiciatis repellendus voluptatibus provident. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quam dignissimos voluptates, tenetur tempore id dolore quaerat dolorum, magni, error accusantium, nisi. Repudiandae, nobis officia, nihil hic error cupiditate atque velit, voluptatibus, vitae necessitatibus quam! Velit, reiciendis. Sequi cum cumque mollitia eaque enim illum, quibusdam inventore doloremque ullam! Ipsam facilis, debitis.
    	</div>
    </footer>
</body>
</html>