<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Get 방식 전송</h1>
<hr>
<form action="getpost" method="get">
	<input name="num1" placeholder="첫번째 숫자"> +
	<input name="num2" placeholder="두번째 숫자">
	<button type="submit">=</button>
</form>
<br>	
<hr>
<h1>Post 방식 전송</h1>
<hr>
<form action="getpost" method="post">
	<table>
	<tr>
		<th><label>아이디</label></th>
		<td><input name="id" type="text"></td>
	</tr>	
	<tr>
		<th><label>비밀번호</label></th>
		<td><input name="password" type="password"></td>	
	</tr>
	</table>
		<button type="submit">회원가입</button>
		<button type="reset">재작성</button>
</form>
</body>
</html>