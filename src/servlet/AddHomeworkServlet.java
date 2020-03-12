package servlet;

import jdbc.StudentHomeworkJdbc;
import model.Homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/AddHomeworkServlet")
public class AddHomeworkServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Homework homework = new Homework();
    homework.setTitle(req.getParameter("title"));
    homework.setContent(req.getParameter("content"));

    StudentHomeworkJdbc.addHomework(homework);

    PrintWriter out = resp.getWriter();
    out.println("Submit successfully!");
  }
}
