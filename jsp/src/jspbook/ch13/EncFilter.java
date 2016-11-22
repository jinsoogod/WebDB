package jspbook.ch13;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebFilter("*.jsp")
public class EncFilter implements Filter {
	
	private String encoding = null;
	
	public EncFilter() {
		
	}
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(request.getCharacterEncoding() == null) {
			request.setCharacterEncoding(encoding);
			chain.doFilter(request, response);
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.encoding = fConfig.getServletContext().getInitParameter("encoding");
	}
}
