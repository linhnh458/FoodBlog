<%-- 
    Document   : chocomo4
    Created on : Mar 15, 2022, 10:57:52 PM
    Author     : Halinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <meta name="description" content="">
            <meta name="author" content="">
            <link rel="icon" href="assets/img/favicon.ico">
            <title>${blog.getBlogTitle()}</title>
            <!-- Bootstrap core CSS -->
            <link href="assets/css/bootstrap.min.css" rel="stylesheet">
            <!-- Fonts -->
            <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
            <link href="https://fonts.googleapis.com/css?family=Righteous%7CMerriweather:300,300i,400,400i,700,700i" rel="stylesheet">
            <!-- Custom styles for this template -->
            <link href="assets/css/mediumish.css" rel="stylesheet">
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
            .homepage-slider{
                margin-top:-70px;
                margin-bottom: 70px;
            }
            .featured-image, .article-post, center{
                margin-top: 30px;
            }
            @media(min-width:568px) {
                .end {
                    margin-left: auto
                }
            }

            @media(max-width:768px) {
                #post {
                    width: 100%
                }
            }

            #clicked {
                padding-top: 1px;
                padding-bottom: 1px;
                text-align: center;
                width: 100%;
                background-color: #ecb21f;
                border-color: #a88734 #9c7e31 #846a29;
                color: black;
                border-width: 1px;
                border-style: solid;
                border-radius: 13px
            }

            #post {
                margin: 7px;
                padding: 6px;
                padding-top: 2px;
                padding-bottom: 2px;
                text-align: center;
                background-color: #ecb21f;
                border-color: #a88734 #9c7e31 #846a29;
                color: black;
                border-width: 1px;
                border-style: solid;
                border-radius: 7px;
                /*width: 50%*/
            }

            #nav-items li a,
            #profile {
                text-decoration: none;
                color: rgb(224, 219, 219);
                background-color: black
            }

            .comments {
                margin-top: 5%;
                margin-left: 20px
            }

            .darker {
                border: 1px solid #ecb21f;
                background-color: black;
                float: right;
                border-radius: 5px;
                padding-left: 40px;
                padding-right: 30px;
                padding-top: 10px
            }

            .comment {
                border: 1px solid rgba(16, 46, 46, 1);
                border-width: 2.5px;
                /*background-color: rgba(16, 46, 46, 0.973);*/
                background-color: white;
                float: left;
                border-radius: 5px;
                padding-left: 40px;
                padding-right: 30px;
                padding-top: 10px
            }

            .comment h4,
            .comment span,
            .darker h4-comment,
            .darker span {
                color: black;
                display: inline;
            }

            .comment p,
            .comment span,
            .darker p,
            .darker span {
                /*color: rgb(184, 183, 183)*/
                color: black;
            }


            .h4-comment {
                color: white;
                font-weight: bold
            }

            label {
                /*color: rgb(212, 208, 208)*/
                color: black;
            }

            #align-form {
                margin-top: 20px
            }

            .form-group p a {
                color: white
            }

            .form-group input,
            .form-group textarea {
                /*background-color: black;*/
                background-color: white;
                border: 1px solid rgba(16, 46, 46, 1);
                border-radius: 12px;
            }
        </style>

        <body>
            <!--header-->
            <%@include file="Component/Header.jsp" %>
            <!--slider-->
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
            </div>

            <!-- Begin Article-->
            <div class="container">
                <div class="row">
                    <!-- Fixed Left Share -- MUST KEEP -->
                    <div class="col-md-2 col-xs-12"></div>
                    <!-- Begin Post -->
                    <div class="col-md-8 col-md-offset-2 col-xs-12">
                        <div class="mainheading">
                            <!-- Begin Top Meta -->
                            <div class="row post-top-meta">
                                <div class="col-md-2">
                                    <img class="author-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3rBk6cU3Vc61LMEIm-7v10sEjoPik31BAxw&usqp=CAU">
                                </div>
                                <div class="col-md-10">
                                    <h6>Written by: ${requestScope.blog.getAuthor()}</h6>
                                    <!--<span class="author-description">Blog founder</span> <br>-->
                                    <span class="post-date">Created date: ${requestScope.blog.getCreatedDate()}</span>
                                </div>
                            </div>
                            <!--title-->
                            <h3 class="section-title">
                                ${requestScope.blog.getBlogTitle()} recipe
                            </h3>
                        </div>
                        <!-- Begin Post Content -->
                        <div class="article-post">
                                ${requestScope.blog.getContent()}
                        </div>
                    </div>
                    <!-- End Post -->
                </div>
            </div>

            <hr size="11" width="70%" color="green" style="height: 2px;">

            <!--comment-->
            <%@include file="Component/CommentDessert.jsp" %>
            <hr size="8" width="70%" color="red" style="height: 2px;">  
            <!-- Begin Related-->
        <center>
            <h3 style="margin-top: 40px;">Other  recipes you may like</h3>
        </center>

        <div class="graybg">
            <div class="container">
                <div class="row listrecent listrelated">
                    <c:forEach items="${requestScope.dessert}" var="des">
                        <div class="col-md-4" style=" margin-bottom: 13px;">
                            <div class="card-about">
                                <center>
                                    <a href="dessert?blogid=${des.getBlogID()}">
                                        <img class="img-fluid img-thumb" src="${des.getImage()}">
                                    </a>
                                </center>
                                <div class="card-block">
                                    <h2 class="card-title" style="margin-top:17px;text-align: center;">
                                        <a href="dessert?blogid=${des.getBlogID()}">${des.getBlogTitle()}</a>
                                    </h2>
                                    <div class="metafooter">
                                        <div class="wrapfooter">
                                            <span class="meta-footer-thumb">
                                                <img class="author-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3rBk6cU3Vc61LMEIm-7v10sEjoPik31BAxw&usqp=CAU">
                                            </span>
                                            <span class="author-meta">
                                                <span class="post-name">${des.getAuthor()}</span><br/>
                                                <span class="post-date">${des.getCreatedDate()}</span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
        <!-- End Related Posts-->
        
        <script>
            function deleteBlogDessert(blogid) {
                var c = confirm("Are you sure to delete this Blog ? ")
                if (c) {
                    window.location.href = "deleteBlogDessert?blogid=" + blogid
                }
            }
        </script>

        <!-- Begin Footer-->
        <%@include file="Component/Footer.jsp" %>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
        <script src="assets/js/mediumish.js"></script>
    </body>
</html>
