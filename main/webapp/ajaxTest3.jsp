<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>   
    <input id="input"><button onclick=loadDoc()>id중복확인</button>
    <div id="inner"></div>
</body>
<script>
    function loadDoc() { //loadDoc라는 함수 호출 
        const xhttp = new XMLHttpRequest(); //XMLHttpRequest 객체를 생성하여 xhttp 변수에 할당  
        xhttp.onload = function() {	// xhttp 객체를 이용하여 서버와 비동기 통신 수행
        	/*onload는 서버로 부터 응답이 정상적으로 받아지면 호출되는 이벤트 리스너(브라우저가 서버에 요청을 보내고)
        	응답을 받을시에 이함수가 실행됨
            */
        	document.getElementById("inner").innerHTML = this.responseText;/*현재 문서에서 ID가 "inner"인 요소를 찾고,
        	해당 요소의innerHTML 속성을 서버로부터 받은 응답 텍스트(this.responseText`)로 설정합니다.
        	이를 통해 웹페이지의 "inner" 요소가 업데이트 됨.*/
        }

        xhttp.open("GET", "DoubleCheckServlet?input=" + document.getElementById("input").value, true);
        xhttp.send();
    }
</script>
</html>
