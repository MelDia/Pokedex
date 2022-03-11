<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>    
<label>ID: </label><span th:text="${id}" /></br>
<label>Name: </label><span th:text="${nombre}" /></br>
<label>Base Experience: </label><span th:text="${baseExperience}"/></br>
<label>Height: </label><span th:text="${height}" /></br>
<label>Weight: </label><span th:text="${weight}" /></br>
<label>Type: </label><span th:text="${type}" /></br>
<label>Sprite: </label><span th:text="${sprite}" /></br>

<!--
<form th:action="@{/searchPokemon}" method="post">
			<label>Buscar Pokemon:</label>  <input type="text" th:field="*{search}" /></br>
            <input type="submit" value="Submit" />
</form>
-->
</body>
</html>