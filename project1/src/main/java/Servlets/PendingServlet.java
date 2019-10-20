package Servlets;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Project1DAO.ReimbursementReqDAOImplOJDBC;

/**
 * Servlet implementation class PendingServlet
 */
public class PendingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PendingServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.getAttribute("user");
		String first_name = (String) request.getParameter("First Name");
		String last_name = (String) request.getParameter("Last Name");
		String reimbursement_amt = (String) request.getParameter("Reimbursement Amount");
		int reimbursement_amount = Integer.parseInt(reimbursement_amt);
		String reimbursement_type = (String) request.getParameter("Reimbursement type");
		
		ReimbursementReqDAOImplOJDBC reimbursementReqDAO = new ReimbursementReqDAOImplOJDBC();
	
		reimbursementReqDAO.setPendingRequests(first_name, last_name, reimbursement_amount, reimbursement_type);
		
		request.getRequestDispatcher("/submitreimbursementrequest.html").forward(request, response);
	}
}