<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파라미터 보내기 연습</h1>
	<hr>
	<form action="ParamServlet" method="get">
		이름 : <input type = "text"  name="num1" placeholder="Input num1..."><br>		
		나이 : <input type = "text"  name="num2" placeholder="Input num2..."><br>		
		<input type="submit" value = "전송">
	</form>
</body>
</html>