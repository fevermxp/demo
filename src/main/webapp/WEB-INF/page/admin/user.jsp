<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
</head>

<body>
    <!-- .content -->
    <div class="row">
        <div class="col-mod-12">
            <ul class="breadcrumb">
             	<c:forEach items="${pathname }" var="p">
                    <li class="active">${p }</li>
                </c:forEach>
             </ul>

            <div class="form-group hiddn-minibar pull-right">
                <input type="text" class="form-control form-cascade-control nav-input-search" size="20" placeholder="Search through site" />
                <span class="input-icon fui-search"></span>
            </div>

            <h3 class="page-header"><i class="fa fa fa-user"></i> 用户管理</h3>

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
                                <th class="visible-lg">登录名</th>
                                <th>工号</th>
                                <th>姓名</th>
                                <th class="visible-lg">最后登录时间</th>
                                <th>操作</th>
                            </tr>
                        </thead>
                        <tbody>
                        	<c:forEach items="${userlist }" var="ul">
                            <tr>
                                <td>
                                    <input type="checkbox" />
                                </td>
                                <td class="visible-lg">${ul.login }</td>
                                <td>${ul.workcode }</td>
                                <td>${ul.realname }</td>
                                <td class="visible-lg"><fmt:formatDate value="${ul.lndt }" type="date"/></td>
                                <td>
                                    <a href="###" class="btn btn-warning"><i class="fa fa-edit"></i>
                                    </a>
                                    <a href="###" class="btn btn-success"><i class="fa fa-trash-o"></i>
                                    </a>
                                </td>
                            </tr>
                            </c:forEach>
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
    <!-- /.content -->
</body>
</html>