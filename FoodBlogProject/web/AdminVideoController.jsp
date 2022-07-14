<%-- 
    Document   : AdminVideoController
    Created on : Apr 12, 2022, 10:31:23 PM
    Author     : Halinh
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- beautify ignore:start -->
<html
    lang="en"
    class="light-style layout-menu-fixed"
    dir="ltr"
    data-theme="theme-default"
    data-assets-path="../assets/"
    data-template="vertical-menu-template-free"
    >
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"
            />
        <title>Video Controller</title>

        <meta name="description" content="" />
        <!-- favicon -->
        <link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
        <!-- Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Public+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&display=swap"
            rel="stylesheet"
            />

        <!-- Icons. Uncomment required icon fonts -->
        <link rel="stylesheet" href="assets/vendor/fonts/boxicons.css" />

        <!-- Core CSS -->
        <link rel="stylesheet" href="assets/vendor/css/core.css" class="template-customizer-core-css" />
        <link rel="stylesheet" href="assets/vendor/css/theme-default.css" class="template-customizer-theme-css" />
        <link rel="stylesheet" href="assets/css/demo.css" />

        <!-- Vendors CSS -->
        <link rel="stylesheet" href="assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.css" />

        <!-- Page CSS -->

        <!-- Helpers -->
        <script src="assets/vendor/js/helpers.js"></script>

        <!--! Template customizer & Theme config files MUST be included after core stylesheets and helpers.js in the <head> section -->
        <!--? Config:  Mandatory theme config file contain global vars & default theme options, Set your preferred theme option in this file.  -->
        <script src="assets/js/config.js"></script>
    </head>
    <body>
        <div class="layout-wrapper layout-content-navbar">
            <div class="layout-container">
                <!-- Menu -->
                <%@include file="Component/AdminMenu.jsp" %>
                <!-- Layout container -->
                <div class="layout-page">
                    <hr class="my-5" />
                    <!-- Bordered Table -->
                    <div class="card-about" style="margin-left: 10px;width:98%">
                        <h5 class="card-header">Video Table</h5>
                        <div class="card-body">
                            <div class="table-responsive text-nowrap">
                                <table class="table table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Video description</th>
                                            <th>Youtube link</th>
                                            <th width="19px;">Status</th>
                                            <th width="29px;">Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.video}" var="vid">
                                            <tr>
                                                <td>${vid.getDescription()}</td>
                                                <td>${vid.getYoutubeLink()}</td>
                                                <c:if test="${vid.status==0}">
                                                    <td>
                                                        <button onclick="changeStatus(${vid.videoID}, 1)" style="background-color:green;color:white">
                                                            Active
                                                        </button>
                                                    </td>
                                                </c:if>
                                                <c:if test="${vid.status==1}">
                                                    <td>
                                                        <button onclick="changeStatus(${vid.videoID}, 0)" style="background-color:red;color:white">
                                                            Deactive
                                                        </button>
                                                    </td>
                                                </c:if>

                                                <td>
                                                    <button onclick="deleteVideo(${vid.videoID})" style="background-color:purple;color:white">
                                                        Delete
                                                    </button>
                                                    <button onclick="editVideo(${vid.videoID})" style="background-color:orange;color:white;margin-left: 17px;">
                                                        Edit
                                                    </button>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <button onclick="addVideo()" style="background-color:orange;color:white;margin-top: 43px;">
                                    Add video
                                </button>
                            </div>
                        </div>
                    </div>
                    <!--end table-->
                </div>
            </div>

        </div>

    </body>

    <!-- build:js assets/vendor/js/core.js -->
    <script src="../assets/vendor/libs/jquery/jquery.js"></script>
    <script src="../assets/vendor/libs/popper/popper.js"></script>
    <script src="../assets/vendor/js/bootstrap.js"></script>
    <script src="../assets/vendor/libs/perfect-scrollbar/perfect-scrollbar.js"></script>

    <script src="../assets/vendor/js/menu.js"></script>
    <!--giu nguyen format-->
    <script src="//cdn.ckeditor.com/4.17.2/full/ckeditor.js"></script>
    <script>
                                    CKEDITOR.replace('content');
    </script>

    <script>
        function changeStatus(id, status) {
            var c = confirm("Do you want to change status ? ")
            if (c) {
                window.location.href = "changeVideoStatus?id=" + id + "&status=" + status
            }
        }
    </script>

    <script>
        function deleteVideo(videoid) {
            var c = confirm("Are you sure to delete this video ? ")
            if (c) {
                window.location.href = "deleteVideo?videoid=" + videoid
            }
        }
    </script>

    <script>
        function editVideo(vidid) {
            window.location.href = "editVideo?vidid=" + vidid
        }
    </script>
    
    <script>
        function addVideo() {
            window.location.href = "addNewVideo"
        }
    </script>
    
    <!-- Main JS -->
    <script src="../assets/js/main.js"></script>

    <!-- Page JS -->

    <!-- Place this tag in your head or just before your close body tag. -->
    <script async defer src="https://buttons.github.io/buttons.js"></script>
</html>
