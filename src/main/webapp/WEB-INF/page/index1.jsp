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
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel='stylesheet prefetch' href='css/bootstrap.min.css'>
<link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
<link rel="stylesheet" href="css/app.css" media="screen" type="text/css" />
<script src="${ctx }/javascript/jquery-2.1.3.min.js"></script>
<script src="${ctx }/javascript/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
	});
</script>
</head>

<body class="login-page">
	${user.login }
</body>
</html>