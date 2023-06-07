<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<hr>	
	<form action="loginpage" method="get"> 
			<table>
				<tr>
						<th>이름</th>
						<td><input type="text" name="name"></td>
				</tr>
				<tr>
						<th>이메일</th>
						<td><input type="email" name="email"></td>
				</tr>
				<tr>
						<th>아이디</th>
						<td><input type="text" name="id"></td>
				</tr>
				<tr>
						<th>비밀번호</th>
						<td><input type="password" name="password"></td>
				</tr>
			</table>
			<button type="submit">가입하기</button>
			 <button type="reset">재작성</button>
		</form>
</body>
</html>