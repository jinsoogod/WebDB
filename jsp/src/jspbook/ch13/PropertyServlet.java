package jspbook.ch13;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(
		urlPatterns = { "/PropertyServlet" },
		initParams = { @WebInitParam(name = "name1", value = "user1"),	@WebInitParam(name = "name2", value = "user2")}
		)
public class PropertyServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
		private static final long serialVersionUID = 1L;
		
		public PropertyServlet() {
			super();
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request, response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<HTML><BODY><center>");
			out.println("<H2>ch13 : PropertyServlet</H2>");
			out.println("<HR>");
			out.println("name1 : " + getInitParameter("name1") + "<BR>");
			out.println("name2 : " + getInitParameter("name2"));
			
			out.println("<HR>");
			out.println("name3 : " + getServletContext().getInitParameter("name3"));
			
			out.println("</center></BODY></HTML>");
		}
}
