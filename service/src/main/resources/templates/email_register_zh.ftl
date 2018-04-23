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
            line-height:80px;
            font-size: 26px;

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
        <p>感谢您 注册/重置 OilUP账号。</p>
    </div>
    <div class="medium">
        <p>请输入下面的验证码，完成注册/重置。</p>
        <p>${params[0]}</p>
        <p>如果您并未申请注册，请忽略本邮件内容。（新用户注册使用）</p>
    </div>
    <div class="footer">
        <p>温馨提示：</p>
        <p>本邮件为系统自动发出，请勿回复。</p>
        <p>感谢您使用OilUP服务！</p>
    </div>
</div>
</body>
</html>