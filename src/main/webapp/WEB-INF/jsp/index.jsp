<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pokedex</title>
        <link href="https://fonts.googleapis.com/css2?family=DotGothic16&display=swap" rel="stylesheet">
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
                          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />

        <script src="https://kit.fontawesome.com/9bc29573df.js" crossorigin="anonymous"></script>
                    
    <style>
        form {
            width: 300px;
            margin: 20px auto;
            border-radius: 10px;
        }

        input {
            width: 100%;
            padding: 10px;
        }

        .poke-card1 {
            position: relative;
            height: 500px;
            max-width: 300px;
            padding: 10px;
            margin: 0px;
            font-family: 'DotGothic16', sans-serif;
            color: #000;
            text-align: center;
            background-color: #ee3d4a;
            border-radius: 10px;
            justify-content: space-between;

        }

        .poke-card2 {
            position: relative;
            height: 500px;
            max-width: 300px;
            padding: 10px;
            margin: 0px;
            font-family: 'DotGothic16', sans-serif;
            color: #000;
            text-align: center;
            background-color: #e52030;
            border-radius: 10px;
            justify-content: space-between;
        }

        .poke-card1::before {
            content: '';
            background: radial-gradient(circle, #F1636E 50%, #e52030 33%);
            background-size: 3px 3px;
            border-radius: 10px;
            height: 100%;
            width: 100%;
            position: absolute;
            left: 5px;
            top: 5px;
            z-index: -1;
        }

        .poke-card2::before {
            content: '';
            background: radial-gradient(circle, #F1636E 50%, #e52030 33%);
            background-size: 3px 3px;
            border-radius: 10px;
            height: 100%;
            width: 100%;
            position: absolute;
            left: 5px;
            top: 5px;
            z-index: -1;
        }

        .middle {
            position: relative;
            height: 400px;
            max-width: 20px;
            padding: 1px;
            margin: 0px;
            margin-top: 50px;
            background-color: #e52030;
            border: 5px solid #e52030;
            justify-content: space-between;
        }

        .engranes1 {
            position: absolute;
            height: 20px;
            max-width: 20px;
            padding: 1px;
            margin: 0px;
            margin-top: 100px;
            background-color: #ee3d4a;
        }

        .engranes2 {
            position: absolute;
            height: 20px;
            max-width: 20px;
            padding: 1px;
            margin: 0px;
            margin-top: 380px;
            background-color: #ee3d4a;
        }

        .img-container {
            position: relative;
            width: 200px;
            height: 200px;
            margin: 10px auto;
            background-color: #dedede;
            border-radius: 10px;

        }

        .poke-img {
            width: 180px;
            border-radius: 10%;
            background-color: #c1f9fe;
            margin-top: 10px;
        }

        .poke-types div {
            padding: 5px;
            margin: 5px;
            margin-left: 40px;
            border-radius: 4px;
            border: 1px solid #dedede;
            background-color: #c1f9fe;
            border-radius: 10px;
            width: 200px;

        }

        .poke-stats {
            padding: 5px;
            margin-top: 30px;
            margin-left: 15px;
            border-radius: 4px;
            border: 10px solid #dedede;
            background-color: #585858;
            border-radius: 10px;
            width: 250px;
            height: 230px;
            justify-content: space-between;
            align-content: space-between;
            font-size: 14px;
            color: white;
        }
        
        .poke-abilities div {
            padding: 5px;
            margin: 5px;
            margin-left: 15px;
            border-radius: 4px;
            border: 10px solid #dedede;
            background-color: #69F0AE;
            border-radius: 10px;
            width: 250px;
            

        }
        
    </style>

</head>
    
<body>

    <div class="input-group rounded">
        <form action="searchPokemon" method="POST">
            <input type="text" name="name" />
        </form>
    </div>

    <div class="row gx-1 justify-content-center">
        <div data-poke-card class="poke-card1 container col-lg-4 col-md-12">

            <div data-poke-name style="font-weight: bold;">- <span th:text="${name}" /> -</div>

            <div data-poke-img-container class="img-container">
                <img data-poke-img class="poke-img" th:src="${sprite}" />               
            </div>

            <div data-poke-id style="font-weight: bold;"> N &#176; <span th:text="${id}" /></div>

            <div data-poke-types class="poke-types">
                <div class="">
                    <span class="poke-types"><span th:text="${type}" /></span> <br>
                </div>
                <div class="">
                    <span class="poke-types"><span th:text="${type2}" /></span> <br>
                </div>
            </div>
        </div>

        <div class="middle col-lg-4 col-md-6"></div>

        <div class="engranes1 col-lg-4 col-md-6"></div>

        <div class="engranes2 col-lg-4 col-md-6"></div>

        <div data-poke-card class="poke-card2 container col-lg-4 col-md-6">
            <div data-poke-stats class="poke-stats">
                <ul class="list-unstyled">
                    <li>base experience: <span th:text="${baseExperience}"/></li>
                    <li>height: <span th:text="${height}" /></li>
                    <li>weight: <span th:text="${weight}" /></li>
                    <li><span th:text="${stats}" /> <span th:text="${baseStat}"/></li>
                    <li><span th:text="${stats1}"/> <span th:text="${baseStat1}"/></li>
                    <li><span th:text="${stats2}"/> <span th:text="${baseStat2}"/></li>
                    <li><span th:text="${stats3}"/> <span th:text="${baseStat3}"/></li>
                    <li><span th:text="${stats4}"/> <span th:text="${baseStat4}"/></li>
                    <li><span th:text="${stats5}"/> <span th:text="${baseStat5}"/></li>
                </ul>
            </div>
                
            <div data-poke-abilities class="poke-abilities ">
                <div class="">
                    <span class="poke-abilities"><span th:text="${ability}" /></span> <br>
                </div>
                <div class="">
                    <span class="poke-abilities"><span th:text="${ability2}" /></span> <br>
                </div>
            </div>    
        </div>
                
        
    </div>
</body>

</html>