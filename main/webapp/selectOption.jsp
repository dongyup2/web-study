<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Select Option 파라미터 보내기</h1>
<hr>
<form action="select" method="get">
	<select name="job" size="4", multiple>
		<option disabled="disabled">선택하세요</option>
		<option value="student">학생</option>
		<option value="teacher">교사</option>
		<option value="coworker">회사원</option>
	</select>
	<input type="submit" value="전송">
</form>
</body>
</html>