<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<title>demo</title>
<link rel="stylesheet" href="${ctx }/css/font-awesome.min.css">
<link rel='stylesheet prefetch' href='${ctx }/css/bootstrap.min.css'>
<link rel="stylesheet" href="${ctx }/css/style.css" media="screen" type="text/css" />
<script src="${ctx }/javascript/jquery-2.1.3.min.js"></script>
<script src="${ctx }/javascript/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#form_login').submit(function(){
			$.ajax({
				type:'post',
				datatype:'json',
				url:'${ctx}/admin/login.html',
				data:$('#form_login').serialize(),
				beforeSend: function() {
                },
                error: function(request) {
                    alert("连接出错！");
                },
				success:function(data){
					if(data.result==1){
						location.href="${ctx}/admin/index.html";
					}else{
						document.getElementById('msg').innerHTML= "";
						document.getElementById('msg').innerHTML= data.result;
						document.getElementById('msg').style.display="";
					}
				}
			});
			return false;
		});
		
		//图片自适应、圆形、缩略图
		$("#mainimage").addClass("carousel-inner img-fheader img-circle img-thumbnail");
	});
</script>
</head>

<body class="login-page">
	<div class="login-form">
		<div class="login-content">
			<form method="post" role="form" id="form_login">
				<div class="form-group">
					<img id="mainimage" src="${ctx }/images/head.jpg">
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-user"></i>
						</div>
						<input type="text" class="form-control" name="login" id="login" placeholder="用户名" autocomplete="off" />
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="fa fa-key"></i>
						</div>
						<input type="password" class="form-control" name="pass" id="pass" placeholder="密码" autocomplete="off" />
					</div>
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block btn-login">
						<i class="fa fa-sign-in"></i>
						登录
					</button>
				</div>
				<div class="login-msg" id="msg">
				</div>
			</form>
		</div>
	</div>
</body>
</html>