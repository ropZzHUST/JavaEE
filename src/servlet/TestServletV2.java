package servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServletV2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String myHeader = req.getHeader("myHeader");
    resp.getWriter().println("Hello servlet GET v2 " + myHeader);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String param = req.getParameter("param");
    resp.getWriter().println("Hello servlet POST v2 " + param);
  }
}
