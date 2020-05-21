import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
	  response.setContentType("text/html");
	  PrintWriter out = response.getWriter();
	  out.print("Hi </br>");
	  
	  //ServletContext ctx = getServletContext();
	 // String str = ctx.getInitParameter("name");
	  ServletConfig ctx = getServletConfig();
	  String str = ctx.getInitParameter("name");
	  out.println(str);
  }
}
