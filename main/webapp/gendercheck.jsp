<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>성별을 선택해주세요.</h1>
    <hr>
    <form action="radio">
        <input type="radio" name="gender" value="man">
        <label for="male">남자</label><br>
        <input type="radio" name="gender"  value="woman">
        <label for="female">여자</label><br>
        <button type="submit" value="전송">전송</button>
    </form>
</body>
</html>
