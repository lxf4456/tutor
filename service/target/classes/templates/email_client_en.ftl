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
    .message{
        margin: 30px 0;
    }
    p{
        line-height: 30px;
    }
</style>
<body>
<div class="container">
    <h5>Hello,</h5>
    <p>
        You have a new message:<br />
    </p>
    <p class="message">
        ${params[0]}
    </p>
    <p>
        <span>Name：</span><span>${params[1]}</span><br>
        <span>Phone:</span><span>${params[2]}</span><br>
        <span>Email:</span><span>${params[3]}</span><br>
        <span>Country：</span><span>${params[4]}</span><br>
    </p>
    <p>
        <span>Submission Time:</span><span>${params[5]}</span><br>
        <span>Submitter:</span><span>${params[6]}</span><br>
    </p>
</div>
</body>
</html>