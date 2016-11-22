package jspbook.ch13;

import javax.servlet.*;
import javax.servlet.annotation.*;

/**
 * Application Lifecycle Listener implementation class TestContextListener
 *
 */
@WebListener public class TestContextListener implements ServletContextListener {

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("TestContextListener 종료되었습니다.");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx = sce.getServletContext();
    	Book mybook = new Book("자바 웹 프로그래밍", "황희정", 20000, "한빛미디어");
    	ctx.setAttribute("book", mybook);
    	System.out.println("TestContextListener 초기화되었습니다.");
    }
	
}
