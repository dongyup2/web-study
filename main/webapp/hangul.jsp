<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Get 방식(한글)</h1>
<form action="hangul" method="get">
	<input type="text" name="xxx" value="aaa">
	<input type="text" name="yyy" value="홍길동">
	<input type="submit" value="전송">
	<!-- http://localhost:8090/ex00/hangul?xxx=aaa&yyy=bbb --> 
</form>
<hr>

<h1>post 방식(한글)</h1>
<form action="hangul" method="post">
	<input type="text" name="xxx" value="aaa">
	<input type="text" name="yyy" value="홍길동">
	<input type="submit" value="전송">
</form> 
</body>
</html>