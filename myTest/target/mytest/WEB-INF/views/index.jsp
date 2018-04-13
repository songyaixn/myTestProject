<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%request.setAttribute("ctx", request.getContextPath());%>
<html>
<body>
<h1>the frist application</h1>

<a href="/demo/demo1.html"><h2>放在web-inf下面</h2></a>
<a href="/html/demo1.html"><h2>放在webapp下</h2></a>
<a href="http://localhost:8080/home/index"><input type="button" value="jjjjj"></a>
<br/>
<img src="/image/111.jpg">
</body>
</html>
