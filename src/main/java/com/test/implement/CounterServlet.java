package main.java.com.test.implement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet  {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
			{
			ServletContext context = getServletContext();
			Integer count = null;
			synchronized(context)
			{
			count = (Integer) context.getAttribute("counter");
			if (null == count)
			{
			count = new Integer(1);
			}
			else
			{
			count = new Integer(count.intValue() + 1);
			}
			context.setAttribute("counter", count);
			}
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			out.println("<html><head>");
			out.println("<title>Test page</title>");
			out.println("</head><body>");
			out.println(" This page has been accessed  " + "<b>" + count +"</b>" +"times");
			out.println("</body></html>");
			out.close();
			}

}
