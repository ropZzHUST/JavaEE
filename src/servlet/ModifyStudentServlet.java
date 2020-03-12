package servlet;

import jdbc.StudentHomeworkJdbc;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ModifyStudentServlet")
public class ModifyStudentServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Student s = new Student();
    s.setName(req.getParameter("modifyName"));

    String orginalName = req.getParameter("orginalName");

    StudentHomeworkJdbc.modifyStudent(s,orginalName);

    PrintWriter out = resp.getWriter();
    out.println("Modify successfully!");

  }
}
