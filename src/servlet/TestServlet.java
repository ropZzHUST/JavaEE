package servlet;

import javax.servlet.*;
import java.io.IOException;

//通过servlet连接数据库，通过jsp展现数据库中的内容
public class TestServlet implements Servlet {
  @Override
  public void init(ServletConfig servletConfig) throws ServletException {

  }

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    servletResponse.getWriter().print("hello Sara!");
  }

  @Override
  public String getServletInfo() {
    return null;
  }

  @Override
  public void destroy() {

  }
}
