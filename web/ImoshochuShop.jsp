<%-- 
    Document   : ImoshochuShop.jsp
    Created on : 2013/03/26, 23:28:09
    Author     : kazutoshi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>芋焼酎酒店カタログ作成版</title>
    </head>
    <body>
        <h1>芋焼酎酒店</h1>
	<p>店主おすすめの芋焼酎を集めてみました。</p>
	<table border="1">
	    <tr>
		<th>銘柄</th>
		<th>銘柄読み方</th>
		<th>度数</th>
		<th>麹</th>
		<th>芋の種類</th>
		<th>製造元</th>
		<th>容量(リットル)</th>
		<th>単価</th>
	    </tr>
	<c:forEach var="meigara" items="${sessionScope.imoCatalog}">
	    <tr>
		<td>${meigara.name}</td>
		<td>${meigara.nameKana}</td>
		<td>${meigara.dosu}</td>
		<td>${meigara.koji}</td>
		<td>${meigara.sweetPotatoName}</td>
		<td>${meigara.manufacturer}</td>
		<td>${meigara.volume}</td>
		<td>${meigara.price}</td>
	    </tr>
	</c:forEach>
	</table>
    </body>
</html>
