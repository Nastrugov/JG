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
    <header>
        <h1>@Galina_KlubokNitok</h1>
    </header>
    <main>
    <div class="w3-bar nst-menu">
      <a href="#" class="w3-bar-item w3-button w3-mobile">Шапки</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Варежки</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Шарфы</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Свитера</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Снуды</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Носочки</a>
    </div>

    <%= request.getAttribute("cards") %>

    <div class="w3-bar nst-menu">
      <a href="#" class="w3-bar-item w3-button w3-mobile">Обо мне</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Оплата</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Доставка</a>
      <a href="#" class="w3-bar-item w3-button w3-mobile">Контакты</a>
    </div>
    </main>
    <p style="font-size: 32px">Пока все....!!!</p>
</body>
</html>
