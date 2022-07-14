<%-- 
    Document   : Video
    Created on : Apr 7, 2022, 3:12:36 PM
    Author     : Halinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>video Page</title>
    </head>

    <style>
        .bigcontainer{
            display: flex;
            flex-wrap:wrap;
            flex-direction: row;
            align-items: center;
            justify-content: space-evenly;
        }
        .card-about {
            /* Add shadows to create the "card" effect */
            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
            transition: 0.3s;
            width: 350px;
            height: 350px;
            text-align: center;
            margin: 63px 0 29px 0;
            padding: 13px;
        }

        /* On mouse-over, add a deeper shadow */
        .card-about:hover {
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
        }

        /* Add some padding inside the card container */
        .container {
            padding: 2px 16px;
        }
        
        h4{
            margin-top: 19px;
        }
        
        iframe{
            width: 330px;
            height: 295px;
        }
        .frame-border{
            border: 4px solid grey;
        }
    </style>

    <body>
        <div class="bigcontainer">
            <div class="card-about">
                <iframe src="https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0"> </iframe>
                <div class="container">
                    <h4><b>John Doe</b></h4>
                </div>
            </div>
            <div class="card-about">
                <iframe src="https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0"> </iframe>
                <div class="container">
                    <h4><b>John Doe</b></h4>
                </div>
            </div>            
            <div class="card-about">
                <iframe src="https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0"> </iframe>
                <div class="container">
                    <h4><b>John Doe</b></h4>
                </div>
            </div>
            <div class="card-about">
                <iframe src="https://www.youtube.com/embed/wMpqCRF7TKg?autoplay=1&mute=0"> </iframe>
                <div class="container">
                    <h4><b>John Doe</b></h4>
                </div>
            </div>

        </div>
    </body>
</html>
