<%-- 
    Document   : Comment
    Created on : Mar 17, 2022, 1:06:28 PM
    Author     : Halinh
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--comment section-->
<section style="margin-top:40px;">
    <div class="container-comment">
        <div class="row">
            <div class="col-sm-5 col-md-6 col-12 pb-4" style="margin-left: 90px;">
                <h1>Comments</h1>
                <c:forEach items="${sessionScope.listComment}" var="c">
                    <div class="comment mt-4 text-justify float-left" style="width:490px"> 
                        <h4 class="h4-comment">${c.getUsername()}</h4><br>
                        <hr size="3" width="20%" color="red" style="height:0.7px;margin-left: 0px;">
                        <p style="margin-bottom:7px;">${c.getContent()}</p><br>
                        <c:if test="${sessionScope.user != null}">
                            <button class="btn btn-danger btn-sm rounded-0" type="button" data-toggle="tooltip" 
                                    data-placement="top" title="Delete" style="margin-left: 450px;"
                                    onclick="deleteComment(${c.getBlogID()},${c.getCommentID()})">
                                <i class="fa fa-trash">
                                </i> 
                            </button>
                        </c:if>


                    </div>
                </c:forEach>
            </div>

            <div class="col-lg-4 col-md-5 col-sm-4 offset-md-1 offset-sm-1 col-12 mt-4"
                 style="margin-left:0px;">
                <form id="algin-form" action="dessert" method="post">
                    <div class="form-group">
                        <h4>Leave a comment</h4> 
                        <div class="form-group"> 
                            <label for="name">Name</label> 
                            <input type="text" name="name" id="fullname" class="form-control" required> 
                        </div>
                        <label for="message">Message</label> 
                        <textarea name="msg" id="" msg cols="30" rows="5" class="form-control" style="background-color: white;" required></textarea>
                    </div>
                    <div class="form-group"> 
                        <button id="post" class="btn">Post Comment</button> 
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<script>
    function deleteComment(blogid, commentid) {
        var c = confirm("Are you sure to delete this comment ? ")
        if (c) {
            window.location.href = "deleteComment?blogid=" + blogid + "&commentid=" + commentid
        }
    }
</script>
