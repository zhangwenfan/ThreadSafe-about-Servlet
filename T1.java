package TE1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class T1
 */
@WebServlet("/T1")
public class T1 extends GenericServlet {

	int i = 0;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		i++;
		try {
			Thread.sleep(1000*4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.getOutputStream().write((i+"").getBytes());
		
	}

}
