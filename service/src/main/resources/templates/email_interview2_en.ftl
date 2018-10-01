<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        body{
            display: flex;
            justify-content: center;
        }
        .wrap{
            width:600px;
            border: 1px solid #ccc;
        }
        .top p{
            margin: 0;
            padding: 20px 0 20px 20px;
            text-align: center;
            /*line-height:80px;*/
            font-size: 26px;
            height:80px;
            background-color: rgb(65, 132, 243);
            color:#f7f7f7;
        }

        .medium{
            font-size:14px;
            padding: 20px;
        }

        .footer{
            padding: 20px 0;
            background:#eeeeee;
        }
        .footer p{
            font-size: 12px;
            color: #999;
            line-height: 20px;
            text-align: center;
            margin: 0;
        }
        .footer p:nth-child(1){
            font-weight:bold;
            color: orange;
        }
    </style>
</head>
<body>
<div class="wrap">
    <div class="top">
        <p>Dear${params[0]}, </p>
    </div>
    <div class="medium">
        <p>Your appointment is successful,please read the instruction closely and click the link to follow the next steps to attend the interview on ${params[1]} on time.</p>
    </div>
</div>
</body>
</html>