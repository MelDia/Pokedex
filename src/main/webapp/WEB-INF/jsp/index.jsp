<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" 
      xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Pokedex</title>
                    <link href="https://fonts.googleapis.com/css2?family=Space+Mono:wght@700&display=swap" rel="stylesheet" />
                    <!-- Bootstrap CSS -->
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />

                    <script src="https://kit.fontawesome.com/9bc29573df.js" crossorigin="anonymous"></script>
                    <script src="script.js" type="text/javascript" defer></script>
                    <style>
                        form {
                            width: 300px;
                            margin: 20px auto;
                            border-radius: 30px;
                        }

                        input {
                            width: 100%;
                            padding: 10px;
                        }

                        .poke-card {
                            position: relative;
                            height: fit-content;
                            font-family: 'Space Mono', monospace;
                            max-width: 300px;
                            border-radius: 30px;
                            color: #000;
                            text-align: center;
                            padding: 10px;
                            margin: 0 auto;
                            background-color: #e48474;
                            border: 1px solid black;
                            justify-content: space-between;
                        }

                        .poke-card::before {
                            content: '';
                            background: radial-gradient(circle, rgba(0, 0, 0, 1) 50%, rgba(228, 132, 116, 1) 33%);
                            background-size: 3px 3px;
                            border-radius: 30px;
                            height: 100%;
                            width: 100%;
                            position: absolute;
                            left: 10px;
                            top: 10px;
                            z-index: -1;
                        }

                        .img-container {
                            position: relative;
                            width: 180px;
                            margin: 10px auto;
                            background-color: #bfe7e6;
                            border-radius: 100px;
                            border: 1px solid black;
                        }

                        .poke-stats div {
                            display: flex;
                            justify-content: space-between;
                            align-content: space-between;
                            padding: 5px;
                            font-size: 14px;
                            border-radius: 30px;
                        }

                        .poke-types div {
                            padding: 5px;
                            margin: 5px;
                            border-radius: 4px;
                            border: 1px solid black;
                            background-color: #fdfee8;
                            border-radius: 30px;
                        }

                        .poke-img {
                            width: 180px;
                            border-radius: 50%;
                        }

                    </style>

                    </head>
                    <body> 

                        <div class="input-group rounded">
                            <form action="searchPokemon" method="POST">
                                <input type="text" name="name"   />
                            </form>
                        </div>
                        

                        <div class="poke-card"> 
                            <div class="poke-name"><span th:text="${name}" /></div>

                            <div class="img-container">

                                <img data-poke-img class="poke-img" th:src="${sprite}" />

                            </div>

                            <div>N &#176; <span th:text="${id}" /></div>
                            <div class="poke-types">
                                <div>
                                    <p><span th:text="${type}" /></p>
                                </div>
                            </div>
                            <div class="poke-stats">
                                <p>Base experience: <span th:text="${baseExperience}"/></p>
                                <p>Height: <span th:text="${height}" /></p>
                                <p>Weight: <span th:text="${weight}" /></p>
                                <p><span th:text="${stats}"/> <span th:text="${baseStat}"/> </p>
                                <p><span th:text="${stats1}"/> <span th:text="${baseStat1}"/> </p>
                                <p><span th:text="${stats2}"/> <span th:text="${baseStat2}"/> </p>
                                <p><span th:text="${stats3}"/> <span th:text="${baseStat3}"/> </p>
                                <p><span th:text="${stats4}"/> <span th:text="${baseStat4}"/> </p>
                                <p><span th:text="${stats5}"/> <span th:text="${baseStat5}"/> </p>
                            </div>
                        </div>



                        <!--
                        <form th:action="@{/searchPokemon}" method="post">
                                                <label>Buscar Pokemon:</label>  <input type="text" th:field="*{search}" /></br>
                                    <input type="submit" value="Submit" />
                        </form>
                        
                        <p><span th:text="${type1}" th:if="${type1 != null}" /></p>
                        -->


                    </body>

                    </html>