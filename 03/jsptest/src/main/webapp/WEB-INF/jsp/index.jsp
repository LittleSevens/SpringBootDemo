<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div class="panel panel-primary">
    <div class="panel-heading">
        <h3 class="panel-title">Spring Boot添加JSP示例</h3>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4">
            <h3>欢迎[<font color="red">${requestScope.username}</font>]</h3>
        </div>
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">图书信息列表</h3>
                </div>
                <div class="panel-body">
                    <div class="table table-responsive">
                        <table class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th class="text-center">封面</th ><th class="text-center">书名</th>
                                <th class="text-center">作者</th ><th class="text-center">价格</th>
                            </tr>
                            </thead>
                            <tbody class="text-center">
                            <c:forEach items="${requestScope.books }" var="book">
                                <tr>
                                    <td> <img src="images/${book.image}" height="60"/></td>
                                    <td>${book.title}</td>
                                    <td>${book.author}</td>
                                    <td>${book.price}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>