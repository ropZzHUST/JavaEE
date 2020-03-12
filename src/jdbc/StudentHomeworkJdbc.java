package jdbc;

import model.Homework;
import model.Student;
import model.StudentHomework;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentHomeworkJdbc {

  public static void main(String[] args) {
    List<StudentHomework> list = selectAll();

    for (StudentHomework sh : list){
      System.out.println(sh.getHomeworkContent());
    }
  }

  //发布作业
  public static void addHomework(Homework sh){

    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "insert into s_student(title,content)values(?,?)";

    PreparedStatement pstmt;
    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setString(1,sh.getTitle());
        pstmt.setString(2,sh.getContent());
        pstmt.execute();
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  //添加学生
  public static void addStudent(Student s){

    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "insert into s_student(name)values(?)";

    PreparedStatement pstmt;
    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setString(1,s.getName());
        pstmt.execute();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  //提交作业
  public static void submitHomework(StudentHomework sh){

    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "insert into s_student_homework(student_id,homework_id,homework_title,homework_content)values(?,?,?,?)";

    PreparedStatement pstmt;

    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setLong(1,sh.getStudentId());
        pstmt.setLong(2,sh.getHomeworkId());
        pstmt.setString(3,sh.getHomeworkTitle());
        pstmt.setString(4,sh.getHomeworkContent());

        pstmt.execute();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //重新提交作业
  public static void resubmitHomework(StudentHomework sh){

    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "update s_student_homework set homework_content=?,update_time=? where student_id=? and homework_id=? and homework_title=?";

    PreparedStatement pstmt;
    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        Timestamp time = new Timestamp(System.currentTimeMillis());
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setString(1,sh.getHomeworkContent());
        pstmt.setTimestamp(2,time);
        pstmt.setLong(3,sh.getStudentId());
        pstmt.setLong(4,sh.getHomeworkId());
        pstmt.setString(5,sh.getHomeworkTitle());
        pstmt.execute();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //教师修改作业
  public static void modifyHomework(Homework h,String title){
    System.out.println("aaa" + title + h.getContent());
    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "update s_homework set content=?,update_time=? where title=?";

    PreparedStatement pstmt;
    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        Timestamp time = new Timestamp(System.currentTimeMillis());
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setString(1,h.getContent());
        pstmt.setTimestamp(2,time);
        pstmt.setString(3,title);
        pstmt.execute();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //修改学生信息
  public static void modifyStudent(Student s,String orginalName){
    System.out.println("aaa" + orginalName + s.getName());
    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "update s_student set name=?,update_time=? where name=?";

    PreparedStatement pstmt;
    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        Timestamp time = new Timestamp(System.currentTimeMillis());
        pstmt = connection.prepareStatement(sqlString);
        pstmt.setString(1,s.getName());
        pstmt.setTimestamp(2,time);
        pstmt.setString(3,orginalName);
        pstmt.execute();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }



  //查询已提交作业
  public static List<StudentHomework> selectAll(){

    String url = "jdbc:mysql://127.0.0.1:3306/school";

    String allUrl = url + "?user=root&password=123456";

    String driverName = "com.mysql.jdbc.Driver";

    String sqlString = "SELECT * FROM s_student_homework";

    try {
      // 加载驱动
      Class.forName(driverName);

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    List<StudentHomework> list = new ArrayList<>();
    try(Connection connection =  DriverManager.getConnection(allUrl)) {
      try(Statement statement = connection.createStatement()){
        try(ResultSet resultSet = statement.executeQuery(sqlString)){
          // 获取执行结果
          while (resultSet.next()){
            StudentHomework sh = new StudentHomework();
            sh.setId(resultSet.getLong("id"));
            sh.setStudentId(resultSet.getLong("student_id"));
            sh.setHomeworkId(resultSet.getLong("homework_id"));
            sh.setHomeworkTitle(resultSet.getString("homework_title"));
            sh.setHomeworkContent(resultSet.getString("homework_content"));
            sh.setCreateTime(resultSet.getTimestamp("create_time"));
            list.add(sh);
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return list;
  }

}
