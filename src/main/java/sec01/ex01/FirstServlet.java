package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/first") //이것은 서블릿
public class FirstServlet extends HttpServlet{
	
	@Override
	public void init()throws ServletException {
		System.out.println("firstservlet 객체가 만들어지며 초기화됨");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("클라이언트에서 GET요청함");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
