<%--
  Created by IntelliJ IDEA.
  User: 11795
  Date: 2020/3/9
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddHomework</title>
</head>
<body>
<div style="text-align: center;">
  <form action="/AddHomeworkServlet" method="post">
    标题：
    <input type="text" name="title" width="600px">
    <br>
    <br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <textarea cols="18" rows="15" name="content">作业内容</textarea>
    <br><br>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <button onclick="window.location.href('index.jsp')">返回</button>
    &nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交"></input>
  </form>
</div>
</body>
</html>
