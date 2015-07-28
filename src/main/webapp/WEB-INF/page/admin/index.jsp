<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>fevermxp</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Loading Bootstrap -->
    <link href="${ctx }/adminplugins/css/bootstrap.css" rel="stylesheet">
    <link href="${ctx }/adminplugins/css/dataTables.bootstrap.css" rel="stylesheet">

    <!-- Loading Stylesheets -->
    <link href="${ctx }/adminplugins/css/font-awesome.css" rel="stylesheet">
    <link href="${ctx }/adminplugins/css/style.css" rel="stylesheet" type="text/css">

    <!-- Loading Custom Stylesheets -->
    <link href="${ctx }/adminplugins/css/custom.css" rel="stylesheet">
    <link rel="shortcut icon" href="${ctx }/adminplugins/images/favicon.ico">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <![endif]-->
</head>

<body>
    <div class="site-holder">
        <!-- this is a dummy text -->
        <!-- .navbar -->
        <nav class="navbar" role="navigation">

            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="#"><i class="fa fa-list btn-nav-toggle-responsive text-white"></i> <span class="logo">FEVER<strong> MXP</strong> <i class="fa fa-bookmark"></i></span></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse">
                <ul class="nav navbar-nav user-menu navbar-right ">
                    <li><a href="#" class="user dropdown-toggle" data-toggle="dropdown"><span class="username"><img src="${ctx }/adminplugins/images/head.jpg" class="user-avatar" alt="">  ${user.realname } </span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="fa fa-user"></i> 个人信息</a>
                            </li>
                            <li><a href="#"><i class="fa fa-envelope"></i> 消息</a>
                            </li>
                            <li><a href="#"><i class="fa fa-cogs"></i> 设置</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="#" class="text-danger"><i class="fa fa-lock"></i> 登出</a>
                            </li>
                        </ul>
                        <li><a href="#" class="settings dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i></a>
                            <ul class="dropdown-menu inbox">
                                <li><a href="inbox.php" class="btn bg-primary">查看全部</a>
                                </li>
                            </ul>
                        <li><a href="#" class="settings"><i class="fa fa-cogs settings-toggle"></i><span class="badge bg-info">1</span></a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>
        <!-- /.navbar -->

        <!-- .box-holder -->
        <div class="box-holder">

            <!-- .left-sidebar -->
            <div class="left-sidebar">
                <div class="sidebar-holder">
                    <ul class="nav  nav-list">

                        <!-- sidebar to mini Sidebar toggle -->
                        <li class="nav-toggle">
                            <button class="btn  btn-nav-toggle text-primary"><i class="fa fa-angle-double-left toggle-left"></i> 
                            </button>
                        </li>

                        <li class="active"><a href="index.html" data-original-title="Dashboard"><i class="fa fa-home"></i><span class="hidden-minibar"> 首页 </span></a>
                        </li>
							<c:forEach items="${menu }" var="mf">
								<li class="submenu">
		                            <a class="dropdown" href="#" data-original-title="Pages"><i class="fa fa-caret-square-o-right"></i><span class="hidden-minibar">  ${mf.menuName } <span class="badge bg-primary pull-right">5</span></span></a>
		                            <ul>
		                            	<c:forEach items="${mf.subMenu }" var="ms">
		                            		<li><a href="calendar.html" data-original-title="Calendar"><i class="fa fa-calendar"></i><span> ${ms.menuName }</span></a>
		                                	</li>
		                            	</c:forEach>
		                            </ul>
		                        </li>
							</c:forEach>
						
                        <li><a href="${ctx }/admin/icons.html" data-original-title="Icons"><i class="fa fa-book"></i><span class="hidden-minibar"> 图标</span></a>
                        </li>
                        <li><a href="http://www.weidea.net" data-original-title="Icons"><i class="fa fa-book"></i><span class="hidden-minibar"> 更多样式</span></a>
                        </li>

                    </ul>
                </div>
            </div>
            <!-- /.left-sidebar -->

            <!-- .content -->
            <div class="content">
                <div class="row">
                    <div class="col-mod-12">

                        <ul class="breadcrumb">
                            <li><a href="index.html">Dashboard</a>
                            </li>
                            <li><a href="template.html">Template</a>
                            </li>
                            <li class="active">DashBoard</li>
                        </ul>

                        <div class="form-group hiddn-minibar pull-right">
                            <input type="text" class="form-control form-cascade-control nav-input-search" size="20" placeholder="Search through site" />
                            <span class="input-icon fui-search"></span>
                        </div>

                        <h3 class="page-header"><i class="fa fa fa-dashboard"></i> Dashboard</h3>

                    </div>
                </div>
                <!-- content-top -->

                <!-- Users widget -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel">
                            <div class="panel-body">
                                <table class="table table-bordered table-condensed table-hover" id="example">
                                    <thead>
                                        <tr>
                                            <th>
                                                <input type="checkbox" />
                                            </th>
                                            <th class="visible-lg">#</th>
                                            <th class="visible-lg">First Name</th>
                                            <th class="visible-lg">Last Name</th>
                                            <th class="visible-lg">Email</th>
                                            <th>Username</th>
                                            <th>Options</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>
                                                <input type="checkbox" />
                                            </td>
                                            <td class="visible-lg">1</td>
                                            <td class="visible-lg">John</td>
                                            <td class="visible-lg">Deo</td>
                                            <td class="visible-lg">johndeo@example.com</td>
                                            <td>@johndeo</td>
                                            <td>
                                                <a href="###" class="btn btn-warning"><i class="fa fa-edit"></i>
                                                </a>
                                                <a href="###" class="btn btn-success"><i class="fa fa-trash-o"></i>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <input type="checkbox" />
                                            </td>
                                            <td class="visible-lg">2</td>
                                            <td class="visible-lg">Jane</td>
                                            <td class="visible-lg">Doe</td>
                                            <td class="visible-lg">johndeo@example.com</td>
                                            <td>@johndeo</td>
                                            <td>
                                                <a href="###" class="btn btn-warning"><i class="fa fa-edit"></i>
                                                </a>
                                                <a href="###" class="btn btn-success"><i class="fa fa-trash-o"></i>
                                                </a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <input type="checkbox" />
                                            </td>
                                            <td class="visible-lg">3</td>
                                            <td class="visible-lg">Jump</td>
                                            <td class="visible-lg">Deo</td>
                                            <td class="visible-lg">johndeo@example.com</td>
                                            <td>@johndeo</td>
                                            <td>
                                                <a href="###" class="btn btn-warning"><i class="fa fa-edit"></i>
                                                </a>
                                                <a href="###" class="btn btn-success"><i class="fa fa-trash-o"></i>
                                                </a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- / Users widget-->
                <div class="footer">
                    © 2015 <a href="http://fevermxp.com">FEVER MXP</a>
                </div>

            </div>
            <!-- /.content -->

            <!-- .right-sidebar -->
            <div class="right-sidebar right-sidebar-hidden">
                <div class="right-sidebar-holder">
                    <!-- @Demo part only The part from here can be removed till end of the @demo  -->
                    <a href="screens.html" class="btn btn-danger btn-block">Logout </a>
                    <h4 class="page-header text-primary text-center">
  						Theme Options
  						<a  href="#"  class="theme-panel-close text-primary pull-right"><strong><i class="fa fa-times"></i></strong></a>
  					</h4>
                    <ul class="list-group theme-options">
                        <li class="list-group-item" href="#">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="fixedNavbar" value="">Fixed Top Navbar
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="fixedNavbarBottom" value="">Fixed Bottom Navbar
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="boxed" value="">Boxed Version
                                </label>
                            </div>

                            <div class="form-group backgroundImage hidden">
                                <label class="control-label">Paste Image Url and then hit enter</label>
                                <input type="text" class="form-control" id="backgroundImageUrl" />
                            </div>
                        </li>
                    </ul>
                </div>
                <!-- /.right-sidebar-holder -->
            </div>
            <!-- /.right-sidebar -->
        </div>
        <!-- /.box-holder -->
    </div>
    <!-- /.site-holder -->
    
    <!-- Load JS here for Faster site load =============================-->
    <script src="${ctx }/adminplugins/js/jquery-1.11.1.min.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.dataTables.min.js"></script>
    <script src="${ctx }/adminplugins/js/jquery-ui-1.10.3.custom.min.js"></script>
    <script src="${ctx }/adminplugins/js/bootstrap.min.js"></script>
    <script src="${ctx }/adminplugins/js/dataTables.bootstrap.js"></script>
    <script src="${ctx }/adminplugins/js/bootstrap-select.js"></script>
    <script src="${ctx }/adminplugins/js/bootstrap-switch.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.placeholder.js"></script>
    <script src="${ctx }/adminplugins/js/bootstrap-typeahead.js"></script>
    <script src="${ctx }/adminplugins/js/application.js"></script>
    <script src="${ctx }/adminplugins/js/moment.min.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.sortable.js"></script>
    <script type="text/javascript" src="${ctx }/adminplugins/js/jquery.gritter.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.nicescroll.min.js"></script>
    <script src="${ctx }/adminplugins/js/prettify.min.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.noty.js"></script>
    <script src="${ctx }/adminplugins/js/jquery.accordion.js"></script>
    <script src="${ctx }/adminplugins/js/skylo.js"></script>

    <script src="${ctx }/adminplugins/js/theme-options.js"></script>

    <!-- Core Jquery File  =============================-->
    <script src="${ctx }/adminplugins/js/core.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
	});
</script>
</body>
</html>