<%-- 
    Document   : Header
    Created on : Feb 20, 2022, 4:26:34 PM
    Author     : Halinh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- header -->
<div id="sticker-sticky-wrapper" class="sticky-wrapper" style="height: 85px;">
    <div class="top-header-area" id="sticker">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-sm-12 text-center">
                    <div class="main-menu-wrap">
                        <!-- menu start -->
                        <nav class="main-menu">
                            <ul>
                                <li class="current-list-item">
                                    <a href="home">Home</a>
                                </li>
                                <li><a href="#">Recipes</a>
                                    <ul class="sub-menu">
                                        <li><a href="dessert">Desserts</a></li>
                                        <li><a href="drink">Drinks</a></li>
                                    </ul>
                                </li>
                                <li class="current-list-item">
                                    <a href="cookingtips">Cooking Tips</a>
                                </li>
                                <li class="current-list-item">
                                    <a href="recommend">Recommend</a>
                                </li>
                                <li>
                                    <c:if test="${sessionScope.user==null}">
                                        <div class="header-icons">
                                            <a class="shopping-cart" href="login"><i class="fa fa-user-circle" aria-hidden="true"></i> &nbsp;Admin Login</a>
                                        </div>
                                    </c:if>
                                    <c:if test="${sessionScope.user!=null}">
                                        <div class="header-icons">
                                            <li><a href="#">${sessionScope.user.getUsername()}</a>
                                                <ul class="sub-menu" style="width: 150px;">
                                                    <li><a href="homeAdmin">Admin control</a></li>
                                                    <li><a href="logout">Logout</a></li>
                                                </ul>
                                            </li>
                                        </div>
                                    </c:if>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end header -->

