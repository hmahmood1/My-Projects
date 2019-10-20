package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import Models.UserModel;
import Project1DAO.UserModelDAO;
import Project1DAO.UserModelDAOImplOJDBC;
import Services.LoginService;

public class LoginServlet extends HttpServlet {

	private static Logger log = Logger.getLogger(LoginServlet.class);
//	private static UserModelDAO userDAO = new UserModelDAOImplOJDBC();
	
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		UserModel user = (UserModel) req.getSession().getAttribute("UserId");
//		ObjectMapper om = new ObjectMapper();
//		String jsonRepUser = user == null ? "null" : om.writeValueAsString(user);
//		log.trace("JSON Rep: " + jsonRepUser);
//	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("Username");
		String password = req.getParameter("Password");
		int id = Integer.parseInt(username);
		UserModel user = new UserModel();
		
		log.trace("User attempting to login with Username: " + username + "and Password: " + password);
		UserModelDAO userDAO = new UserModelDAOImplOJDBC();
		
		
		UserModelDAOImplOJDBC impStuff = new UserModelDAOImplOJDBC(); 
		user = impStuff.getUser(id, password);
		
		
		
		if (user != null) {
			if(user.getJob_title().equals("Police Captain")) {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				req.getRequestDispatcher("/ManagerHomePage.html").forward(req, resp);
			} else {
				HttpSession session = req.getSession();
				session.setAttribute("user", user);
				req.getRequestDispatcher("/EmployeeHomePage.html").forward(req, resp);
			}
		} else {
			req.getRequestDispatcher("/FailedLogin.html").forward(req, resp);
		}
	}
}