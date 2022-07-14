<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">
        <!-- title -->
        <title>Linh's cookbook - Home</title>
        <!-- favicon -->
        <link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
        <!-- google font -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
        <!-- fontawesome -->
        <link rel="stylesheet" href="assets/css/all.min.css">
        <!-- bootstrap -->
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <!-- owl carousel -->
        <link rel="stylesheet" href="assets/css/owl.carousel.css">
        <!-- magnific popup -->
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <!-- animate css -->
        <link rel="stylesheet" href="assets/css/animate.css">
        <!-- mean menu css -->
        <link rel="stylesheet" href="assets/css/meanmenu.min.css">
        <!-- main style -->
        <link rel="stylesheet" href="assets/css/main.css">
        <!-- responsive -->
        <link rel="stylesheet" href="assets/css/responsive.css">

    </head>

    <style>
        
        #text_about{
            font-size: 20px;
        }

        .bigcontainer{
            display: flex;
            flex-wrap:wrap;
            flex-direction: row;
            align-items: center;
            justify-content: space-around;
        }
        .card-about {
            /* Add shadows to create the "card" effect */
            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
            transition: 0.3s;
            width: 410px;
            height: 390px;
            text-align: start;
            margin: 63px 22px 29px 0;
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
    </style>
    <body>
        <!--PreLoader-->
        <div class="loader">
            <div class="loader-inner">
                <div class="circle"></div>
            </div>
        </div>
        <!--PreLoader Ends-->

        <%@include file="Component/Header.jsp" %>

        <!--home page slider--> 
        <div class="homepage-slider">
            <div class="single-homepage-slider homepage-bg-1">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 col-lg-7 offset-lg-1 offset-xl-0">
                            <div class="hero-text">
                                <div class="hero-text-tablecell">
                                    <p class="subtitle">Easy and Delicious food</p>
                                    <h1>Let's make this, shall we?</h1>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--single home slider--> 
            <div class="single-homepage-slider homepage-bg-2">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-10 offset-lg-1 text-center">
                            <div class="hero-text">
                                <div class="hero-text-tablecell">
                                    <p class="subtitle">Amazing Recipes by Linhha</p>
                                    <h1>100% fun guaranteed</h1>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--about section-->
        <div class="bigcontainer">
            <div class="card-about" >
                <h3 style="text-align: center;"><b>About</b></h3>
                <div class="container">
                    <p id="text_about">As an avid food-maker and a person who loves helping others,
                        I decided to create this blog in order to support all the people that are struggling 
                        with making food because cooking can be really fun and easy. </p>
                    <p id="text_about">So grab a knife and let's get started, shall we?</p>
                </div>
            </div>
        </div>
        <!-- end about section -->

        <div class="row" style="margin-top:94px;margin-bottom: 20px;">
            <div class="col-lg-8 offset-lg-2 text-center">
                <div class="section-title" style="margin-bottom: -99px;">	
                    <h3>
                        <span class="orange-text">Most </span>Popular Recipes 
                    </h3>
                    <p>Below are some of the favorite recipes on my site, 
                        they are all really easy and super fun to make.
                    </p>
                </div>
            </div>
        </div>

        <!-- recipe section -->
        <div class="product-section mt-150 mb-150" >
            <div class="container">
                <!--display dessert category-->
                <div class="row">
                    <c:forEach items="${requestScope.dessert}" var="blog">
                        <div class="col-lg-4 col-md-6 text-center">
                            <div class="single-product-item">
                                <div class="product-image">
                                    <img src="${blog.getImage()}">
                                </div>
                                <h3>${blog.getBlogTitle()}</h3>
                                <a href="dessert?blogid=${blog.getBlogID()}" class="cart-btn">View this recipe</a>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- end recipe section -->

        <!-- testimonail-section -->
        <div style="margin-top:-90px;" class="testimonail-section mt-150 mb-150">
            <div class="container">
                <div class="row">
                    <div class="col-lg-10 offset-lg-1 text-center">
                        <h3 class="orange-text" style="margin-bottom:39px;margin-top: 40px;">Reader reviews</h3>
                        <div class="testimonial-sliders">
                            <c:forEach items="${requestScope.review}" var="r">
                                <div class="client-meta">
                                    <h3>${r.getUserName()} <span>${r.getJob()}</span></h3>
                                    <p class="testimonial-body">
                                        "${r.getReviewContent()}"
                                    </p>
                                    <div class="last-icon">
                                        <i class="fas fa-quote-right"></i>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- end testimonail-section -->

        <%@include file="Component/Footer.jsp" %>
        <script>
            alert(${pageContext.request.contextPath})
        </script>

        <!-- jquery -->
        <script src="assets/js/jquery-1.11.3.min.js"></script>
        <!-- bootstrap -->
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <!-- count down -->
        <script src="assets/js/jquery.countdown.js"></script>
        <!-- isotope -->
        <script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
        <!-- waypoints -->
        <script src="assets/js/waypoints.js"></script>
        <!-- owl carousel -->
        <script src="assets/js/owl.carousel.min.js"></script>
        <!-- magnific popup -->
        <script src="assets/js/jquery.magnific-popup.min.js"></script>
        <!-- mean menu -->
        <script src="assets/js/jquery.meanmenu.min.js"></script>
        <!-- sticker js -->
        <script src="assets/js/sticker.js"></script>
        <!-- main js -->
        <script src="assets/js/main.js"></script>

    </body>
</html>