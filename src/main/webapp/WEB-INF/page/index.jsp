<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> 
  <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> 
  <![endif]-->
  <!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
  <!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
  <head>
    <title>Fevermxp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="" />
    <meta name="author" content="templatemo">
    <meta charset="UTF-8">
	
    <!-- CSS Bootstrap & Custom -->
    <link href="${ctx }/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="${ctx }/css/font-awesome.min.css" rel="stylesheet" type="text/css">  
    <link href="${ctx }/slider/flexslider.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="${ctx }/css/templatemo_style.css" rel="stylesheet" type="text/css">
    <!-- Modernizr -->
    <script src="${ctx }/slider/modernizr.js"></script>
    <!-- HTML 5 shim for IE backwards compatibility -->
  <!-- [if lt IE 9]>
  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
  </script>
  <![endif]-->
</head>
<body>

  <nav class="navbar navbar-default navbar-fixed-top" role="navigation">    
    <div class="container">
      <div class="row">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="col-md-2 col-sm-2 col-xs-12">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand"><img src="${ctx }/images/templatemo_logo.png" alt="fevermxp"></a>
          </div>
        </div>        
        
        <div class="col-md-10 col-sm-10 col-xs-12">
          <div class="navbar-collapse collapse menu">          
            <ul class="nav navbar-nav navbar-right">
              <li><a href="#home" class="title_baanner"><i class="fa fa-home"></i>主页</a></li>
              <li><a href="#about" class="title_baanner"><i class="fa fa-user"></i>关于我们</a></li>
              <li><a href="#services" class="title_baanner"><i class="fa fa-cogs"></i>服务</a></li>
              <li><a href="#portfolio" class="title_baanner"><i class="fa fa-briefcase"></i>相册</a></li>
              <li><a href="#blog" class="title_baanner"><i class="fa fa-pencil"></i>博客</a></li>
              <li><a href="#contact" class="title_baanner"><i class="fa fa-envelope"></i>邮件</a></li>
              <li><a id="admin_page" href="#" class="title_baanner"><i class="fa fa-sign-in"></i>登录后台</a></li>
            </ul>
          </div><!-- /.navbar-collapse -->
        </div>
      </div><!-- /.row -->
    </div>
  </nav>

  <div class="container" id="home">
    <div class="row">
      <div class="col col-md-12">        
        <div class="flexslider">
          <ul class="slides">
            <li>
              <img src="${ctx }/images/templatemo_slide_1.jpg" alt="slide 1" />
              <p class="flex-caption">第一张图片...</p>
            </li>
            <li>
              <img src="${ctx }/images/templatemo_slide_2.jpg" alt="slide 2" />
              <p class="flex-caption">第二张图片...</p>
            </li>
            <li>
              <img src="${ctx }/images/templatemo_slide_3.jpg" alt="slide 3" />
              <p class="flex-caption">第三张图片...</p>
            </li>
          </ul>
        </div>            
      </div>
    </div>
  </div>
  <section id="about">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-sm-12"><h1>关于我</h1></div>
          <div class="col col-md-7 col-sm-12 center-row" id="about_content">
            <div class="row center">
              <div class="col col-md-4 col-sm-12 templatemo_ceo">
                <img src="${ctx }/images/head.jpg" alt="fevermxp" class="center-block img-circle img-responsive">
                <p>fevermxp</p>
              </div>
              <div class="col col-md-8 col-sm-12">
              	<p>大家好！我是fevermxp，欢迎来参观我的个人网页！</p>
                <p>本网站基于SpringMVC+MyBatis开发，前台用到了当下最流行的bootstrap3.3响应式布局框架来展现。本站借鉴了部分Karma的前台设计，感谢Karma的分享。如果在使用过程中发现任何BUG，请根据下方邮件来告诉我，感谢您的支持！</p>
                <p>目前仍处于测试阶段，待网页基本功能完成后我会在github上分享代码，希望对大家有用！</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section id="team">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-md-push-7 col-sm-12"><h1>我们的一家</h1></div>
          <div class="col col-md-7 col-md-pull-5 col-sm-12 center-row" id="team_content">
            <div class="row center">
              <div class="col col-md-4 col-sm-4 col-xs-4">
                <img src="${ctx }/images/father.jpg" alt="father" class="img-circle img-responsive">
                <p>晓鹏爸爸</p>
                <p>Manager</p>
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-4">
                <img src="${ctx }/images/mather.jpg" alt="mather" class="img-circle img-responsive">
                <p>雪儿妈妈</p>
                <p>Designer</p>
              </div>        
              <div class="col col-md-4 col-sm-4 col-xs-4">
                <img src="${ctx }/images/son.jpg" alt="Helen" class="img-circle img-responsive">
                <p>宝贝</p>
                <p>Artist</p>
              </div>        
            </div>        
          </div>        
        </div>
      </div>
    </div>
  </section>
  <section id="services">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-sm-12 col-xs-12">
            <h1>服务</h1>
          </div>
          <div class="col-md-2 col-sm-2 col-xs-2">
            <div class="services_buttons">
              <ul id="services_tabs">
                <li class="icon-button active" data-target="#pencil"><i class="fa fa-pencil" style="vertical-align: middle"></i></li>
                <li class="icon-button" data-target="#cog"><i class="fa fa-cog"></i></li>            
                <li class="icon-button" data-target="#signal"><i class="fa fa-signal"></i></li>
              </ul>
            </div>
          </div>
          <div class="col col-md-5 col-sm-10 col-xs-10 center-row" id="services_content">
            <div class="arrow-left"></div>
            <div class="arrow-box center-row">
              <div class="tab-content center">              
                <div class="tab-pane fade in active" id="pencil">
                  	<h3>Web Design</h3>
                  	<p>Donec vehicula lectus ac ultrices aliquam. Pellentesque aliquam erat justo, nec auctor sem vulputate vitae. Praesent varius neque in dolor cursus dictum. Donec dignissim nibh nec adipiscing vehicula.</p>
               	  	<p><a href="#">Mobile website template</a> is ready to use for your website. Quisque euismod enim et dignissim dictum. Vivamus eu tortor pharetra, mollis orci eget, pulvinar nisl.</p>
                </div>
                <div class="tab-pane fade" id="cog">
                	<h3>Online Marketing</h3>
                  	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tempor elit nec metus pellentesque posuere. Donec velit arcu, vehicula nec tellus eu.</p>
                  	<p>Vestibulum ac enim.Vestibulum at mollis justo, eu elementum nisi. Sed consequat odio eget nunc tristique venenatis. Nullam non eros molestie, tristique libero ut, lacinia diam.</p>
                </div>
                <div class="tab-pane fade" id="signal">
                	<h3>Social Media</h3>
                  	<p>Quisque gravida ac nisl nec ultrices. Mauris tincidunt magna vitae feugiat tincidunt. Maecenas semper quis arcu in porta.</p>
                  	<p>Download <a rel="nofollow" href="#">templates</a> for your websites. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean adipiscing quam sed neque dapibus, id convallis mauris eleifend. Quisque sit amet nisl a ante pulvinar sodales.</p>
                </div>
              </div>                                     
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section id="skills">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-md-push-7 col-sm-12"><h1>技能</h1></div>
          <div class="col col-md-7 col-md-pull-5 col-sm-12">
            <br>
            <div class="progress vertical">
              <div class="progress-bar" role="progressbar" aria-valuenow="5" aria-valuemin="0" aria-valuemax="5" style="height: 20%;width: 100%">
                <div class="progress-label">
                  <p>Android</p> 
                  <p>一年</p>
                </div>
              </div>
            </div>
            <div class="progress vertical">
              <div class="progress-bar" role="progressbar" aria-valuenow="5" aria-valuemin="0" aria-valuemax="5" style="height: 100%;width: 100%">
                <div class="progress-label">
                  <p>HTML</p> 
                  <p>五年</p>
                </div>
              </div>
            </div>
            <div class="progress vertical">
              <div class="progress-bar" role="progressbar" aria-valuenow="1" aria-valuemin="0" aria-valuemax="5" style="height: 20%;width: 100%">
                <div class="progress-label">
                  <p>HTML5</p> 
                  <p>一年</p>
                </div>
              </div>
            </div>
            <div class="progress vertical">
              <div class="progress-bar" role="progressbar" aria-valuenow="3" aria-valuemin="0" aria-valuemax="5" style="height: 60%;width: 100%">
                <div class="progress-label">
                  <p>jQuery</p> 
                  <p>三年</p>
                </div>
              </div>
            </div>
            <div class="progress vertical">
              <div class="progress-bar" role="progressbar" aria-valuenow="5" aria-valuemin="0" aria-valuemax="5" style="height: 100%;width: 100%">
                <div class="progress-label">
                  <p>JAVA WEB</p> 
                  <p>五年</p>
                </div>
              </div>
            </div>
          </div>        
        </div>
      </div>
    </div>
  </section>
  <section id="portfolio">
    <div class="outer_container">
      <div class="container">
        <div class="row">      
          <div class="col col-md-5 col-sm-12"><h1>相册</h1></div>
          <div class="col col-md-7 col-sm-12" id="portfolio_content">
            <div class="row">
              <div class="col col-md-4 col-sm-4 col-xs-6">
                <div class="portfolio-item">                  
                  <div class="portfolio-thumb">
                    <img src="${ctx }/images/templatemo_slide_3_sm.jpg" alt="portfolio image 1" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>First Title</h2>
                        <p>Lorem ipsum dolor sit amet, adipiscing elit. Vivamus elit nec metus pellentesque.</p> 
                      </a>
                    </div>
                  </div>                     
                </div>      
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-6">  
                <div class="portfolio-item">
                  <div class="portfolio-thumb">              
                    <img src="${ctx }/images/templatemo_image_05_sm.jpg" alt="portfolio image 2" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>Title Two</h2>
                        <p>Donec elit arcu, accumsan quis sagittis vitae, porttitor et velit.</p> 
                      </a>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-6">
                <div class="portfolio-item">
                  <div class="portfolio-thumb">
                    <img src="${ctx }/images/templatemo_slide_1_sm.jpg" alt="portfolio image 3" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>Third Title</h2>
                        <p>Proin porttitor urna et enim semper lobortis eu vitae diam.</p> 
                      </a>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-6">
                <div class="portfolio-item">
                  <div class="portfolio-thumb">
                    <img src="${ctx }/images/templatemo_image_06_sm.jpg" alt="portfolio image 4" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>Title Four</h2>
                        <p>Maecenas semper quis arcu in porta. Donec elit arcu, vitae, porttitor et velit.</p> 
                      </a>
                    </div>
                  </div>                  
                </div>      
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-6">  
                <div class="portfolio-item">
                  <div class="portfolio-thumb">              
                    <img src="${ctx }/images/templatemo_image_07_sm.jpg" alt="portfolio image 5" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>Fifth Title</h2>
                        <p>Vivamus tempor elit nec metus pellentesque posuere.</p> 
                      </a>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col col-md-4 col-sm-4 col-xs-6">
                <div class="portfolio-item">
                  <div class="portfolio-thumb">
                    <img src="${ctx }/images/templatemo_slide_2_sm.jpg" alt="portfolio image 6" class="img-responsive">
                    <div class="overlay-p">
                      <a href="#">
                        <h2>Title Six</h2>
                        <p>Vestibulum ac enim.Vestibulum at mollis justo, eu elementum nisi.</p> 
                      </a>
                    </div>
                  </div>
                </div>
              </div>   
            </div>          
          </div>
        </div>
      </div>
    </div>
  </section>
  <section id="blog">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-md-push-7 col-sm-12"><h1>博客</h1></div>
          <div class="col col-md-7 col-md-pull-5 col-sm-12">
            <div class="blog_posts_container">
              <div class="blog_post">
                <h2>22<br>October</h2>
                <img src="${ctx }/images/templatemo_image_05.jpg" alt="Blog Post 1" class="img-responsive">
              </div>    
              <div class="blog_post">
                <h2>23<br>October</h2>      
                <img src="${ctx }/images/templatemo_image_06.jpg" alt="Blog Post 2" class="img-responsive">
              </div>
            </div>          
          </div>              
        </div>
      </div>
    </div>
  </section>
  <section id="contact">
    <div class="outer_container">
      <div class="container">
        <div class="row">
          <div class="col col-md-5 col-sm-12"><h1>联系我</h1></div>
          <div class="col col-md-7 col-sm-12 col-xs-12 center-row" id="contact_content">
            <form role="form" action="#" method="post" class="center">
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <input name="fullname" type="text" class="form-control" id="input_name" placeholder="Name...">
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <input name="email" type="email" class="form-control" id="input_email" placeholder="Email...">
                  </div>                
                </div> 
              </div>
              <div class="row">
                <div class="col-md-12">
                  <div class="form-group">
                    <textarea name="message" rows="3" class="form-control" id="input_message" placeholder="Message..."></textarea><br>
                    <button type="submit" class="btn btn-primary pull-right">发送</button>
                  </div>
                </div>
              </div> <!-- row -->
            </form>          
          </div>
        </div>
      </div>
    </div>
  </section>
  <footer>
    <div class="container">        
      <div class="row">
        <div class="col col-md-6 col-sm-6 col-xs-6 col-xxs">
          <img src="${ctx }/images/templatemo_logo.png" alt="fevermxp">
          <div id="templatemo_copyright">
            Copyright &copy; 2014.FEVERMXP All rights reserved.<a target="_blank" href="http://localhost:8080/demo/">fevermxp</a>
          </div>
        </div>        
         <div class="col col-md-6 col-sm-6 col-xs-6 col-xxs">
          <div class="pull-right">
            <div class="social_buttons">
              <a href="#" rel="nofollow" class="icon-button facebook"><i class="fa fa-facebook"></i></a>
              <a href="#" rel="nofollow" class="icon-button twitter"><i class="fa fa-twitter"></i></a>             
              <a href="#" rel="nofollow" class="icon-button youtube"><i class="fa fa-youtube"></i></a>
            </div>
            <a href="#" id="go-top"><div class="back_to_top">Back To Top</div></a>
          </div>            
        </div>
      </div> 
    </div>
  </footer>

  <!-- JavaScripts -->
  <script src="${ctx }/javascript/jquery-2.1.3.min.js"></script>
  <script src="${ctx }/javascript/bootstrap.min.js"></script>
  <script src="${ctx }/javascript/jquery.singlePageNav.js"></script>
  <script defer src="${ctx }/slider/jquery.flexslider.js"></script>
  <script type="text/javascript">

    $(window).load(function(){
      $('.flexslider').flexslider({
        animation: "slide",
        start: function(slider){
          $('body').removeClass('loading');
          $('.menu').singlePageNav();
        }
      });
      
      $('#admin_page').click(function(){
    	  location.href="${ctx }/admin/index.html";
      });
    });

    $('#go-top').click(function(event) {
      event.preventDefault();
      jQuery('html, body').animate({scrollTop: 0}, 1000);
      return false;
    });
    
  </script>
</body>
</html>