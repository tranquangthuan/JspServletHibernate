<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="#">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Products Management</h1>
		<h2>
			<a href="${pageContext.request.contextPath}/product-add"
				class="btn btn-danger">Add New Products</a>
		</h2>

		<table class="table table-dark">
			<thead>
				<tr>
					<td>Order</td>
					<td>Name</td>
					<td>Color</td>
					<td>Quantity</td>
					<td>Status</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${products}" varStatus="loop">
					<tr>
						<td>${loop.count}</td>
						<td>${product.name}</td>
						<td>${product.color }</td>
						<td>${product.quantity }</td>
						<td><c:if test="${product.quantity > 0 }">
						    Con Hang
						</c:if> <c:if test="${product.quantity <= 0}">
						    Het Hang
						</c:if></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>