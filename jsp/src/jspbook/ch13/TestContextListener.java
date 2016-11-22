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
    	System.out.println("TestContextListener ����Ǿ����ϴ�.");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	ServletContext ctx = sce.getServletContext();
    	Book mybook = new Book("�ڹ� �� ���α׷���", "Ȳ����", 20000, "�Ѻ��̵��");
    	ctx.setAttribute("book", mybook);
    	System.out.println("TestContextListener �ʱ�ȭ�Ǿ����ϴ�.");
    }
	
}
