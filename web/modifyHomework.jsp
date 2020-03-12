<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ModifyHomework</title>
</head>
<body>
<div style="text-align: center;">
  <form action="/ModifyHomeworkServlet" method="post">
    请输入要修改作业的标题：
    <br><br>
    <input type="text" name="title" width="600px">
    <br>
    <br>
    &nbsp;
    <textarea cols="18" rows="15" name="content">修改后的作业内容：</textarea>
    <br><br>
    <button onclick="window.location.href('index.jsp')">返回</button>
    &nbsp;&nbsp;&nbsp;
    <input type="submit" value="提交"></input>
  </form>
</div>
</body>
</html>
