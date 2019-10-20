package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.UserModel;
import Project1DAO.UserModelDAOImplOJDBC;

/**
 * Servlet implementation class UpdateEmployeeInformationServlet1
 */
public class UpdateEmployeeInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployeeInformationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UserModel user;
		try {
			user = new UserModel(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = req.getSession();
		user = (UserModel) session.getAttribute("user");
		int id = user.getId();
		
		String job_Title = req.getParameter("Job Title");
		String address = req.getParameter("Address");
		String saLary = req.getParameter("Salary");
//		String username = req.getParameter("Username");
//		int id = Integer.parseInt(username);
		int salary = Integer.parseInt(saLary);
		UserModelDAOImplOJDBC userDAO = new UserModelDAOImplOJDBC();
		
		userDAO.updateUserInfo(job_Title, address, salary, id);

		req.getRequestDispatcher("/view and updateinformation.html").forward(req, resp);
	}
}