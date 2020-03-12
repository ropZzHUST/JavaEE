package servlet;

import jdbc.StudentHomeworkJdbc;
import model.Homework;
import model.Student;
import model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Student s = new Student();

    s.setName(req.getParameter("studentName"));

    StudentHomeworkJdbc.addStudent(s);

    PrintWriter out = resp.getWriter();
    out.println("Add successfully!");
  }
}
