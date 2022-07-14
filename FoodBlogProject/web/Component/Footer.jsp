<%-- 
    Document   : Footer
    Created on : Feb 20, 2022, 4:26:25 PM
    Author     : Halinh
--%>

<style>
    #review{
        height: 32px;
        border-radius: 5px;
        margin-bottom: 10px;
        padding: 10px;
    }
   
</style>
<!-- footer -->
<div class="footer-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6">
                <div class="footer-box get-in-touch">
                    <h2 class="widget-title">Get in Touch</h2>
                    <ul>
                        <li>Hanoi.</li>
                        <li>+00 111 222 3333</li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="footer-box pages">
                    <h2 class="widget-title">Pages</h2>
                    <ul>
                        <li><a href="home">Home</a></li>
                        <li>Recipes
                            <ul class="sub-menu">
                                <li><a href="dessert">Desserts</a></li>
                                <li><a href="drink">Drinks</a></li>
                            </ul>
                        </li>
                        <li><a href="cookingtips">Tips</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <div class="footer-box subscribe" style="width: 270px;">
                    <h2 class="widget-title">Tell me what you think</h2>
                    <p>Speak your thoughts here</p>
                    <form action="home" method="post">
                        <input id="review" name="name" type="text" placeholder="Your name" required>
                        <input id="review" name="job" type="text" placeholder="Your job(optional)">
                        <textarea name="msg" msg cols="30" rows="5" class="form-control" style="background-color: white;" placeholder="Your message" required></textarea>
                        <button type="submit" style="margin-top:11px;"><i class="fas fa-paper-plane"></i></button>
                    </form>
                    <h6>${requestScope.response}</h6>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- end footer -->
