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
    <div class="medium">
        <p>Dear ${params[0]}, </p>
        <p>We are delighted to inform you of being selected for Private Education Counselor (PEC) Program. Welcome to be our PEC online teacher!</p>
        <p>The next steps will be: </p>
        <p>1.Mimi Ho (mimi.ho@dreamon-edu.com) in LA will contact you for signing the contract within three working days.</p>
        <p>2.Kira Yuan (kira.yuan@dreamon-edu.com) from Beijing Office in China will contact you within three working days for PEC orientation upon Mimi’s receiving your contract.  </p>
        <p>3.Please follow Slide No.17 in the Step-by-Step Instructions to fill in the information and upload the files in "Teacher Info". </p>
        <p>Please don’t hesitate to contact us if you have any questions.</p>

    </div>
</div>
</body>
</html>