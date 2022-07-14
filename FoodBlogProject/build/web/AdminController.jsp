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

        <title>Admin Console</title>

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
        <!-- Layout wrapper -->
        <div class="layout-wrapper layout-content-navbar">
            <div class="layout-container">
                <!-- Menu -->
                <%@include file="Component/AdminMenu.jsp" %>
                <!-- Layout container -->
                <div class="layout-page">
                    <div class="content-wrapper">
                        <!-- Content -->
                        <div class="container-xxl flex-grow-1 container-p-y">
                            <h4 class="fw-bold py-3 mb-4">Create a post</h4>
                            <div class="row">
                                <div class="col-xxl">
                                    <div class="card-about mb-4">
                                        <div class="card-body">
                                            <form action="homeAdmin" method="post">
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-name">Blog title</label>
                                                    <div class="col-sm-10" style="width:23%">
                                                        <input type="text" class="form-control" id="basic-default-name" name="title" required/>
                                                    </div>
                                                </div>
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-company">Author</label>
                                                    <div class="col-sm-10" style="width:23%">
                                                        <input type="text" class="form-control" id="basic-default-company" name="author" required/>
                                                    </div>
                                                </div>
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-company">Category</label>
                                                    <div class="col-sm-10" style="width:23%">
                                                        <select name="cate" required style="border-radius: 8px;width: 90px;">
                                                            <option value="dessert">Dessert</option>
                                                            <option value="drink">Drink</option>
                                                            <option value="tip">Tip</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-message">Content</label>
                                                    <div class="col-sm-10" style="width:100%">
                                                        <textarea
                                                            id="basic-default-message" name="content" required
                                                            class="form-control" style="height:100px;"
                                                            ></textarea>
                                                    </div>
                                                </div>
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-company" >Image</label>
                                                    <div class="col-sm-10" style="width:23%">
                                                        <!--<input type="text" class="form-control" id="basic-default-company" name="img"/>-->
                                                        <input class="form-control" id="basic-default-company" type="file" id="img" name="img" accept="image/*">
                                                    </div>
                                                </div>
                                                <div class="row mb-3">
                                                    <label class="col-sm-2 col-form-label" for="basic-default-company">Date created</label>
                                                    <div class="col-sm-10" style="width:23%">
                                                        <input name="date" type="date" class="form-control" id="basic-default-company" required/>
                                                    </div>
                                                </div>
                                                <div class="row justify-content-end">
                                                    <div class="col-sm-10">
                                                        <button type="submit" class="btn btn-primary">Create</button>
                                                    </div>
                                                </div>
                                            </form>
                                            <h4>${requestScope.mess}</h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>

        </div>
        <!-- / Layout wrapper -->
    </body>
    
    
        <!-- Core JS -->
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


        <!-- Main JS -->
        <script src="../assets/js/main.js"></script>

        <!-- Page JS -->

        <!-- Place this tag in your head or just before your close body tag. -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
</html>
