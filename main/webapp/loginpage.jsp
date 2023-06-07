<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 페이지입니다</h1>
<hr>
<form action="pagemove" method="get">
<table>
	<tr>
		<th><label>아이디 </label><input name="id" placeholder="아이디"></th>
	</tr>
	<tr>
		<th><label>비밀번호 </label><input name="password" placeholder="비밀번호"></th>
	</tr>
</table>
<button type="submit">로그인</button>
<button type="reset">재작성</button>
</form>
</body>
</html>