<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Ajax Test</h1>
<hr>
<button onclick="rockPaperScissors()">서버야..내가 뭘 내는게을까?</button><br>
 <img alt="" src="" id ="choiceImage"> 
<div id="demo">서버의 응답 결과(안내문)</div>
<script>
	const imgSrc = {
	  '가위': 'src/main/web/img/scissors.jpg',
	  '바위': 'src/main/webapp/img/rock.jpg',
	  '보' : 'src/main/webapp/img/paper.jpg'
	};

	function rockPaperScissors() {
	  const choices = ['가위', '바위', '보'];
	  const randomIndex = Math.floor(Math.random() * choices.length);
	  const myChoice = choices[randomIndex];

	  // 이미지 업데이트 부분
	  const choiceImage = document.getElementById("choiceImage");
	  choiceImage.src = imgSrc[myChoice];

	  const xhttp = new XMLHttpRequest();
	  xhttp.onload = function() {
	    // 서버 응답을 div에 반영
	    document.getElementById("demo").innerHTML = "You chose " + myChoice + ". " + this.responseText;
	  };
	  xhttp.open("GET", "RockPaperScissorsServlet?choice=" + myChoice, true);
	  xhttp.send();
	}
</script>
</body>
</html>
