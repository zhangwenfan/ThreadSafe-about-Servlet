package TE1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestHttpS
 */
@WebServlet("/TestHttpS")
public class TestHttpS extends HttpServlet {
	int i = 0;
	
	/*@Override
	public void init() throws ServletException {
		System.out.print("init");
		super.init();
	}*/

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		i++;
		response.getOutputStream().write((i+"").getBytes());
		try {
			Thread.sleep(1000*4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getOutputStream().write((i+"").getBytes());
		response.getOutputStream().write("Servlet".getBytes());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("doPost");
		doGet(request, response);
	}

}
