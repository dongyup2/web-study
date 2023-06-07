<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험문제</title>
<style>
table {
	width: 80%;
	margin: 0 auto;
	border-collapse: collapse;
}

th, td {
	border: 1px solid #000;
	padding: 8px;
	text-align: left;
}

h1 {
	text-align: center;
}

form {
	width: 80%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<h1>시험문제</h1>
	<hr>
	<form action="exam" method="get">
		<table>
			<tr>
				<th colspan="2">1번. 다음 중 JSP의 특징은?</th>
			</tr>
			<tr>
				<td><input type="radio" name="question1">1.</td>
				<td><input type="radio" name="question1">2.</td>
			</tr>
			<tr>
				<td><input type="radio" name="question1">3.</td>
				<td><input type="radio" name="question1">4.</td>
			</tr>
			<tr>
				<th colspan="2">2번. 다음중 자바의 특징은?</th>
			</tr>
			<tr>
				<td><input type="radio" name="question2">1.</td>
				<td><input type="radio" name="question2">2.</td>
			</tr>
			<tr>
				<td><input type="radio" name="question2">3.</td>
				<td><input type="radio" name="question2">4.</td>
			</tr>
			
			<tr>
				<th colspan="2">3번. 다음 중 프로그래밍 언어가 아닌 것은?</th>
			</tr>
			<tr>
				<td colspan="2"><select name="exam3" size="5">
						<option value="ex3">JAVA</option>
						<option value="ex3">C</option>
						<option value="ex3">Korean</option>
						<option value="ex3">English</option>
						<option value="ex3">math</option>
				</select></td>
			</tr>
			<tr>
				<th colspan="2">4번. 다음 중 ??? 특징은?(2가지를 고르시오)</th>
			</tr>
			<tr>
				<td><input type="radio" name="question4">1. </td>
				<td><input type="radio" name="question4">2.</td>
			</tr>
			<tr>
				<td><input type="radio" name="question4">3.</td>
				<td><input type="radio" name="question4">4.</td>
			</tr>
			<td><input type="radio" name="question4">5.</td>
			<td><input type="radio" name="question4">6.</td>
			</tr>
			<tr>
				<th colspan="2">5번.자바 특징 한 가지를 적으세요.</th>
			</tr>
			<tr>
				<td colspan="2"><input type="text" name="answer5"
					style="width: 100%" height='50px'></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit"
					value="전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>