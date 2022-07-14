<%-- 
    Document   : AdminMenu
    Created on : Apr 12, 2022, 9:53:45 PM
    Author     : Halinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<aside id="layout-menu" class="layout-menu menu-vertical menu bg-menu-theme">
    <div class="app-brand demo"></div>
    <!--<div class="menu-inner-shadow"></div>-->
    <ul class="menu-inner py-1">
        <li class="menu-header small text-uppercase">
            <span class="menu-header-text">Functions</span>
        </li>
        <!-- Create post --> 
        <li class="menu-item">
            <a href="homeAdmin" class="menu-link">
                <i class="menu-icon tf-icons bx bx-crown"></i>
                <div data-i18n="Analytics">Create a post</div>
            </a>
        </li>
        <!--post functions-->
        <li class="menu-item">
            <a href="adminBlogController" class="menu-link">
                <i class="menu-icon tf-icons bx bx-support"></i>
                <div data-i18n="Analytics">Edit Post</div>
            </a>
        </li>
        <!-- Recommend Video -->
        <li class="menu-item">
            <a href="adminVideo" class="menu-link">
                <i class="menu-icon tf-icons bx bx-cube-alt"></i>
                <div data-i18n="Analytics">Recommend Video</div>
            </a>
        </li>
        <!-- Filter -->
        <li class="menu-item">
            <a href="adminReview" class="menu-link">
                <i class="menu-icon tf-icons bx bx-detail"></i>
                <div data-i18n="Analytics">Filter review</div>
            </a>
        </li>
        <li class="menu-header small text-uppercase">
            <span class="menu-header-text"></span>
        </li>
        <li class="menu-item">
            <a href="home" class="menu-link">
                <i class="menu-icon tf-icons bx bx-home-circle"></i>
                <div data-i18n="Analytics">Back to home</div>
            </a>
        </li>
    </ul>
</aside>
