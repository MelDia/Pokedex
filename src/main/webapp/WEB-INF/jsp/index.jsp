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
            border-radius: 50px;
            border: 5px solid #e52030;
        }

        input {
            width: 100%;
            padding: 10px;
            border-radius: 50px;
            border: 5px solid #e52030;
        }
        
        body {
            background-image: url(data:image/png;base64,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);
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
            width: 210px;
            height: 210px;
            margin: 10px auto;
            background-color: #5bc4da;
            border-radius: 10px;
            border-bottom-left-radius: 70px;
            border: 10px solid #dedede;

        }

        .poke-img {
            width: 180px;
            border-radius: 50%;
            margin-top: 5px;
        }

        .poke-types div {
            padding: 5px;
            margin: 5px;
            margin-left: 40px;
            border-radius: 4px;
            border: 1px solid #e4ebf3;
            background-color: #e4ebf3;
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
            border-radius: 10px;
            border: 1px solid #c2e8ff;
            background-color: #c2e8ff;
            width: 250px;
            
        }
        
    </style>

</head>
    
<body>

    <div class="input-group rounded search">
        <form action="searchPokemon" method="POST">
            <input type="text" name="name" placeholder="Search your pokemon"/>
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