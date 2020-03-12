<%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/3/9
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddStudent</title>
</head>
<body>
<div style="text-align: center;">
  <form action="/AddStudentServlet" method="post">
    添加的学生姓名：
    <input type="text" name="studentName" width="600px">
    <br><br>
    <button onclick="window.location.href('index.jsp')">返回</button>
    &nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交"></input>
  </form>
</div>
</body>
</html>
