<%-- 
    Document   : PostToedit
    Created on : Mar 14, 2022, 8:48:08 AM
    Author     : Halinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="assets/img/favicon.ico">
        <title>Mediumish - A Medium style template by WowThemes.net</title>
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
        .single-homepage-slider{
            margin-top:-70px;
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
            margin: 10px;
            padding: 6px;
            padding-top: 2px;
            padding-bottom: 2px;
            text-align: center;
            background-color: #ecb21f;
            border-color: #a88734 #9c7e31 #846a29;
            color: black;
            border-width: 1px;
            border-style: solid;
            border-radius: 13px;
            width: 50%
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
            display: inline
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

        /*        #checkbx {
                    background-color: black;
                }*/

        #darker img {
            margin-right: 15px;
            position: static
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
        <%@include file="Component/Header.jsp" %>
        <!--slider-->
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


        </div>

        <!-- Begin Article -->
        <div class="container">
            <div class="row">

                <!-- Begin Fixed Left Share -->
                <div class="col-md-2 col-xs-12">

                </div>
                <!-- End Fixed Left Share -->

                <!-- Begin Post -->
                <div class="col-md-8 col-md-offset-2 col-xs-12">
                    <div class="mainheading">

                        <!-- Begin Top Meta -->
                        <div class="row post-top-meta">
                            <div class="col-md-2">
                                <a href="author.html"><img class="author-thumb" src="https://www.gravatar.com/avatar/e56154546cf4be74e393c62d1ae9f9d4?s=250&amp;d=mm&amp;r=x" alt="Sal"></a>
                            </div>
                            <div class="col-md-10">
                                <a class="link-dark" href="author.html">Sal</a><a href="#" class="btn follow">Follow</a>
                                <span class="author-description">Founder of WowThemes.net and creator of <b>"Mediumish"</b> theme that you're currently previewing. Developing professional premium themes, templates, plugins, scripts since 2012.</span>
                                <span class="post-date">22 July 2017</span><span class="dot"></span><span class="post-read">6 min read</span>
                            </div>
                        </div>
                        <!-- End Top Menta -->

                        <h1 class="posttitle">18 Things You Should Learn Before Moving Into a New Home</h1>

                    </div>

                    <!-- Begin Featured Image -->
                    <img class="featured-image img-fluid" src="assets/img/demopic/10.jpg" alt="">
                    <!-- End Featured Image -->

                    <!-- Begin Post Content -->
                    <div class="article-post" >
                        Avocado smoothie <br>
                        <blockquote>
                            <img src="Images/avocado.jpg">
                        </blockquote>
                        
                    </div>
                    <!-- End Post -->

                </div>
            </div>
            <!-- End Article
            ================================================== -->

            <div class="fb-like" data-href="" data-width="" data-layout="standard" data-action="like" data-size="small" data-share="false"></div>
            <div class="hideshare"></div>
            <div id="fb-root"></div>
            <script async defer crossorigin="anonymous" src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v13.0" nonce="0wxYcjoP"></script>

            <!-- Begin Related
            ================================================== -->
            <div class="graybg">
                <div class="container">
                    <div class="row listrecent listrelated">

                        <!-- begin post -->
                        <div class="col-md-4">
                            <div class="card">
                                <a href="post.html">
                                    <img class="img-fluid img-thumb" src="assets/img/demopic/9.jpg" alt="">
                                </a>
                                <div class="card-block">
                                    <h2 class="card-title"><a href="post.html">Best recreational places to visit on a holiday</a></h2>
                                    <div class="metafooter">
                                        <div class="wrapfooter">
                                            <span class="meta-footer-thumb">
                                                <a href="author.html"><img class="author-thumb" src="https://www.gravatar.com/avatar/e56154546cf4be74e393c62d1ae9f9d4?s=250&amp;d=mm&amp;r=x" alt="Sal"></a>
                                            </span>
                                            <span class="author-meta">
                                                <span class="post-name"><a href="author.html">Sal</a></span><br/>
                                                <span class="post-date">22 July 2017</span><span class="dot"></span><span class="post-read">6 min read</span>
                                            </span>
                                            <span class="post-read-more"><a href="post.html" title="Read Story"><svg class="svgIcon-use" width="25" height="25" viewbox="0 0 25 25"><path d="M19 6c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v14.66h.012c.01.103.045.204.12.285a.5.5 0 0 0 .706.03L12.5 16.85l5.662 4.126a.508.508 0 0 0 .708-.03.5.5 0 0 0 .118-.285H19V6zm-6.838 9.97L7 19.636V6c0-.55.45-1 1-1h9c.55 0 1 .45 1 1v13.637l-5.162-3.668a.49.49 0 0 0-.676 0z" fill-rule="evenodd"></path></svg></a></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- end post -->

                        <!-- begin post -->
                        <div class="col-md-4">
                            <div class="card">
                                <a href="post.html">
                                    <img class="img-fluid img-thumb" src="assets/img/demopic/8.jpg" alt="">
                                </a>
                                <div class="card-block">
                                    <h2 class="card-title"><a href="post.html">How travelling can change your life</a></h2>
                                    <div class="metafooter">
                                        <div class="wrapfooter">
                                            <span class="meta-footer-thumb">
                                                <a href="author.html"><img class="author-thumb" src="https://www.gravatar.com/avatar/e56154546cf4be74e393c62d1ae9f9d4?s=250&amp;d=mm&amp;r=x" alt="Sal"></a>
                                            </span>
                                            <span class="author-meta">
                                                <span class="post-name"><a href="author.html">Sal</a></span><br/>
                                                <span class="post-date">22 July 2017</span><span class="dot"></span><span class="post-read">6 min read</span>
                                            </span>
                                            <span class="post-read-more"><a href="post.html" title="Read Story"><svg class="svgIcon-use" width="25" height="25" viewbox="0 0 25 25"><path d="M19 6c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v14.66h.012c.01.103.045.204.12.285a.5.5 0 0 0 .706.03L12.5 16.85l5.662 4.126a.508.508 0 0 0 .708-.03.5.5 0 0 0 .118-.285H19V6zm-6.838 9.97L7 19.636V6c0-.55.45-1 1-1h9c.55 0 1 .45 1 1v13.637l-5.162-3.668a.49.49 0 0 0-.676 0z" fill-rule="evenodd"></path></svg></a></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- end post -->

                        <!-- begin post -->
                        <div class="col-md-4">
                            <div class="card">
                                <a href="post.html">
                                    <img class="img-fluid img-thumb" src="assets/img/demopic/7.jpg" alt="">
                                </a>
                                <div class="card-block">
                                    <h2 class="card-title"><a href="post.html">Little red dress and a perfect summer</a></h2>
                                    <div class="metafooter">
                                        <div class="wrapfooter">
                                            <span class="meta-footer-thumb">
                                                <a href="author.html"><img class="author-thumb" src="https://www.gravatar.com/avatar/e56154546cf4be74e393c62d1ae9f9d4?s=250&amp;d=mm&amp;r=x" alt="Sal"></a>
                                            </span>
                                            <span class="author-meta">
                                                <span class="post-name"><a href="author.html">Sal</a></span><br/>
                                                <span class="post-date">22 July 2017</span><span class="dot"></span><span class="post-read">6 min read</span>
                                            </span>
                                            <span class="post-read-more"><a href="post.html" title="Read Story"><svg class="svgIcon-use" width="25" height="25" viewbox="0 0 25 25"><path d="M19 6c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v14.66h.012c.01.103.045.204.12.285a.5.5 0 0 0 .706.03L12.5 16.85l5.662 4.126a.508.508 0 0 0 .708-.03.5.5 0 0 0 .118-.285H19V6zm-6.838 9.97L7 19.636V6c0-.55.45-1 1-1h9c.55 0 1 .45 1 1v13.637l-5.162-3.668a.49.49 0 0 0-.676 0z" fill-rule="evenodd"></path></svg></a></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- end post -->

                    </div>
                </div>
            </div>
            <!-- End Related Posts-->

            <!--comment-->

            <!-- Main Body -->
            <section style="margin-top:40px;">
                <div class="container-comment">
                    <div class="row">
                        <div class="col-sm-5 col-md-6 col-12 pb-4">
                            <h1>Comments</h1>
                            <div class="comment mt-4 text-justify float-left"> 
                                <h4 class="h4-comment">Jhon Doe</h4><br>
                                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Accusamus numquam assumenda hic aliquam vero sequi velit molestias doloremque molestiae dicta?</p>
                            </div>
                            <div class="comment mt-4 text-justify float-left">
                                <h4 class="h4-comment">Rob Simpson</h4>
                                <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Accusamus numquam assumenda hic aliquam vero sequi velit molestias doloremque molestiae dicta?</p>
                            </div>
                        </div>
                        <div class="col-lg-4 col-md-5 col-sm-4 offset-md-1 offset-sm-1 col-12 mt-4">
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

