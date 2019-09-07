package servlet.com.aditya.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.aditya.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		LoginDao dao = new LoginDao();

		if (uname.equals("admin") && pass.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("AdminHP.jsp");
		} else if (dao.check(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("HomePageDemo.jsp");
		} else {
			// response.sendRedirect("LoginPage.jsp");
			request.setAttribute("loginmsg", "Invalid Username or Password");
			RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
			rd.include(request, response);
		}

	}
}

/*
 * protected void doPost(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { // TODO Auto-generated
 * method stub doGet(request, response); }
 * 
 * }
 */