<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileupLoadResult</title>
</head>
<body>


<!-- 
  [ pageContext ] 
  : JSP의 명령어를 el tag 에서 살 수 있게 해줌 

-->

Context path:  ${pageContext.request.contextPath}/${filename}

<br/>
File name: ${filename}
<br/>
<br/>

${result }
<br/>

<img alt="사진이 나와야 할 자리" src="${pageContext.request.contextPath}/${filename}" style="width: 450px; height: 450px;"/>  


</body>
</html>