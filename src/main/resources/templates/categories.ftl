<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<style>
    body {
        margin: 0px;
        padding: 0px;
        background-image: url('https://ulduztourism.az/wp-content/uploads/2017/09/National-Library-of-Azerbaijan.jpg');
        background-size: cover;

    }

    .elements {
        display: flex;
        flex-direction: column;
        align-items: center;
        row-gap: 20px;
        width: 80%;
        margin: 150px;
        box-sizing: border-box;
    }

    .element {
        justify-content: space-around;
        padding: 20px;
        display: flex;
        background-color: rgba(110, 53, 202, 0.5);
        row-gap: 20px;
        min-width: 250px;
        box-sizing: border-box;
        min-height: 200px;
        border-radius: 10px;
    }

    .column {
        width: 250px;
        display: flex;
        flex-direction: column;
    }

    .column p {
        border-bottom: 1px solid white;
        padding: 10px;
        text-align: center;
        font-size: 15px;
        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
        color: white;
        font-weight: bold;
    }

</style>

<div class="elements">
    <#list categories as category>
        <div class="element">
            <div class="column">
                <p>id</p>
                <p>name</p>
            </div>
            <div class="seperator"></div>
            <div class="column">
                <p>${category.id}</p>
                <p>${category.name}</p>
            </div>
        </div>
    </#list>
</div>
</body>
</html>