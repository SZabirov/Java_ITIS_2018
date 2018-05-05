<html>
<head>
    <meta charset="UTF-8">
    <title>Все голосования</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
          integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/create" method="POST">
        <div class="form-group">
            <label for="title">Введите новый вопрос для голосования:</label> <br>
            <input type="text" class="form-control" name="title" id="title"> <br>
        </div>
        <button type="submit" class="btn btn-secondary">Добавить</button>
    </form>
</div>
</body>
</html>