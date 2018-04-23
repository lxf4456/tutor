<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>mail</title>
</head>
<style>
    *{
        font-size: 14px;
    }
    .container{
        width: 1000px;
        margin: 0 auto;
        border: 1px solid #bbbbbb;
        border-radius: 7px;
        padding: 50px;
    }
    p{
        line-height: 30px;
    }
    .time{
        border: 1px solid #666;
        width: 100%;
        border-radius: 5px;
        padding: 0 3px;
    }
</style>
<body>
<div class="container">
    <h5>您好，</h5>
    <p>
        您有一条新的回呼留言：<br />
    </p>
    <p>
        <span>姓名：</span><span>${params[0]}</span><br>
        <span>电话：</span><span>${params[1]}</span><br>
        <span>国家：</span><span>${params[2]}</span><br>
    </p>
    <p>
        我们将在您方便接听的时间，向您致电！
    </p>
    <p>
        <span class="time">${params[3]}</span>--<span class="time">${params[4]}</span>
    </p>
    <p>
        <span>提交时间：</span><span>${params[5]}</span><br>
        <span>提交人：</span><span>${params[6]}</span><br>
    </p>
</div>
</body>
</html>