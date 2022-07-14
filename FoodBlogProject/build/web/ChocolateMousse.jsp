<%-- 
    Document   : chocomo4
    Created on : Mar 15, 2022, 10:57:52 PM
    Author     : Halinh
--%>

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
            <title>Chocolate mousse</title>
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

            /*        #profile {
                        background-color: unset
                    }*/

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
                                    <h6>Written by: Linhha</h6>
                                    <span class="author-description">Blog founder</span> <br>
                                    <span class="post-date">Created date: ${requestScope.blog.getCreatedDate()}</span>
                                </div>
                            </div>
                            <!--title-->
                            <h3 class="section-title">
                                The easiest recipe for chocolate mousse<br>
                                (also the most addictive one)
                            </h3>
                        </div>
                        <!-- Begin Post Content -->
                        <div class="article-post">
                            <div>
                                If you're a chocolate lover then this is something that you have to know,
                                the chocolate mousse will definitely charm your taste instantly. 
                            </div>
                            <br>
                            <div>
                                Ingredients needed:
                                <ul>
                                    <li>Chocolate(I recommend using the type with at least 65% cacao)</li>
                                    <li>Heavy cream/whipping cream</li>
                                    <li>Eggs(optional)</li>
                                </ul>
                            </div>
                            <div>
                                Now here are the steps: 
                            </div><br>
                            <blockquote>
                                First you need to melt the chocolate then let it cool for a while
                            </blockquote>
                            <img class="featured-image img-fluid" src="Images/meltedChoco.jpg"> <br>
                            <blockquote>
                                <div>While waiting for the chocolate to cool down a bit, let's start whipping your cream.</div>
                                <div>Use a hand or a stand mixer to beat your cream, or you can use a whisk and some muscles if you want to be Popeyes.
                                    Keep going until it forms a soft peak.
                                </div> <br>
                                <div>(A tip: use cold cream instead of room temp for faster result).</div> <br>
                                <div>Also be careful not to over or under whip the cream, otherwise your mousse will turn
                                    into shit.
                                </div>
                            </blockquote>
                            <img class="featured-image img-fluid" src="Images/whippedCream.jpg"> <br>

                            <blockquote>
                                <div>Finally, when your cream is ready, all you need to do is mix it with the melted chocolate</div>
                                <div>And that's it, that's your super easy two-ingredient choco mousse. 
                                    Now you just need to put it the fridge for about an hour or two then enjoy
                                </div>
                            </blockquote>  <br>  
                            <div>But wait, that is good but a bit too simple dont you think?
                                Let's add something more to enhance the taste, shall we?
                            </div> <br>
                            <blockquote>
                                > Take the eggs from earlier and separate the yolk and the white,
                                beat the white egg until it gets thicken and forms a soft peak <br>
                                > Mix the yolk with the chocolate, the white with the cream <br>
                                > And finally, put the 2 mixtures together <br>
                                (You can also add more flavors such as fruits, topped with whipped cream or anything of your preference,
                                make as many layers as you want)
                            </blockquote>
                            <img class="featured-image img-fluid" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqBR63kFcHScqQ_MA-mKZJF63SfHsGT058mw&usqp=CAU"> <br>
                            <div>
                                Enjoy the creamy, thic and smooth mousse ! 
                            </div><br>

                        </div>
                    </div>
                    <!-- End Post -->
                </div>
            </div>

            <hr size="11" width="70%" color="green" style="height: 2px;">

            <!--comment-->
            <!-- Main Body -->
            <section style="margin-top:40px;">
                <div class="container-comment">
                    <div class="row">
                        <div class="col-sm-5 col-md-6 col-12 pb-4" style="margin-left: 90px;">
                            <h1>Comments</h1>
                            <div class="comment mt-4 text-justify float-left" style="width:490px"> 
                                <h4 class="h4-comment">Jhon Doe</h4><br>
                                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Accusamus numquam assumenda hic aliquam vero sequi velit molestias doloremque molestiae dicta?</p>
                            </div>
                            <div class="comment mt-4 text-justify float-left" style="width:490px">
                                <h4 class="h4-comment">Rob Simpson</h4>
                                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Accusamus numquam assumenda hic aliquam vero sequi velit molestias doloremque molestiae dicta?</p>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-5 col-sm-4 offset-md-1 offset-sm-1 col-12 mt-4"
                             style="margin-left:0px;">
                            <form id="algin-form">
                                <div class="form-group">
                                    <h4>Leave a comment</h4> <label for="message">Message</label> 
                                    <textarea name="msg" id="" msg cols="30" rows="5" class="form-control" style="background-color: white;"></textarea>
                                </div>
                                <div class="form-group"> 
                                    <label for="name">Name</label> <input type="text" name="name" id="fullname" class="form-control"> 
                                </div>
                                <div class="form-group">
                                    <label for="email">Email</label> <input type="text" name="email" id="email" class="form-control">
                                </div>

                                <div class="form-group"> 
                                    <button id="post" class="btn">Post Comment</button> 
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>

            <hr size="8" width="70%" color="red" style="height: 2px;">  
            <!-- Begin Related-->
        <center>
            <h3 style="margin-top: 40px;">Other recipes you may like</h3>
        </center>
        <div class="graybg">
            <div class="container">
                <div class="row listrecent listrelated">
                    <!-- begin post1 -->
                    <div class="col-md-4">
                        <div class="card">
                            <a href="post.html">
                                <img class="img-fluid img-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJ0cost64Av7mJAP-DyRBP7kW-F3LNdXEkwQ&usqp=CAU" >
                            </a>
                            <div class="card-block">
                                <h2 class="card-title"><a href="post.html">The only choco cookies recipe you need</a></h2>
                                <div class="metafooter">
                                    <div class="wrapfooter">
                                        <span class="meta-footer-thumb">
                                            <img class="author-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3rBk6cU3Vc61LMEIm-7v10sEjoPik31BAxw&usqp=CAU">
                                        </span>
                                        <span class="author-meta">
                                            <span class="post-name">Linhha</span><br/>
                                            <span class="post-date">22-03-2022</span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- begin post2 -->
                    <div class="col-md-4">
                        <div class="card">
                            <a href="post.html">
                                <img class="img-fluid img-thumb" src="https://images.immediate.co.uk/production/volatile/sites/30/2021/02/butter-chicken-ac2ff98.jpg">
                            </a>
                            <div class="card-block">
                                <h2 class="card-title"><a href="post.html">Guide to make the addictive butter chicken</a></h2>
                                <div class="metafooter">
                                    <div class="wrapfooter">
                                        <span class="meta-footer-thumb">
                                            <a href="author.html"><img class="author-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3rBk6cU3Vc61LMEIm-7v10sEjoPik31BAxw&usqp=CAU"></a>
                                        </span>
                                        <span class="author-meta">
                                            <span class="post-name">Linhha</span><br/>
                                            <span class="post-date">22 July 2017</span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- begin post3 -->
                    <div class="col-md-4">
                        <div class="card">
                            <a href="post.html">
                                <img class="img-fluid img-thumb" src="https://cdn2.cocinadelirante.com/sites/default/files/images/2017/05/tintodeverano.jpg">
                            </a>
                            <div class="card-block">
                                <h2 class="card-title"><a href="post.html">Tinto de verano for the summer</a></h2>
                                <div class="metafooter">
                                    <div class="wrapfooter">
                                        <span class="meta-footer-thumb">
                                            <a href="author.html"><img class="author-thumb" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS3rBk6cU3Vc61LMEIm-7v10sEjoPik31BAxw&usqp=CAU" alt="Sal"></a>
                                        </span>
                                        <span class="author-meta">
                                            <span class="post-name">Linhha</span><br/>
                                            <span class="post-date">22 July 2017</span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <!-- End Related Posts-->

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
