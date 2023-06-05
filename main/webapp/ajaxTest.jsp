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
<button onclick="loadDoc()">서버야..내가 뭘 내는게 좋을까?</button>

<script>
	function loadDoc() {
		  const xhttp = new XMLHttpRequest();
		  xhttp.onload = function() {
		    document.getElementById("demo").innerHTML = this.responseText;
		  }
				  
		  xhttp.open("GET", "ParamServlet?num1="+ num1.value+ "&num2="+num2.value, true);
		  xhttp.send();
		  
		  document.getElementById("demo2").innerHTML = "내가 먼저 나올까?";
		}
</script>
</body>
</html>