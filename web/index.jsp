<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>My Homework</title>
</head>
<body>
  <div style="text-align: center">
    <span>教师：</span>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('addHomework.jsp')">添加作业</button>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('addStudent.jsp')">添加学生</button>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('checkHomework.jsp')">查看作业</button>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('modifyHomework.jsp')">修改作业</button>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('modifyStudent.jsp')">修改学生信息</button>
    <br><br>
  </div>

  <div style="text-align: center">
    <span>学生：</span>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('submitHomework.jsp')">提交作业</button>
    <br><br>
    <button style="height: 30px;width: 120px;" onclick="window.location.href('resubmitHomework.jsp')">重新提交</button>
    <br><br>
  </div>

</body>
</html>
