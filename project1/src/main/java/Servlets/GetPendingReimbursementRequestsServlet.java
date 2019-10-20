package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

import Models.ReimbursementReq;
import Project1DAO.ReimbursementReqDAOImplOJDBC;

/**
 * Servlet implementation class GetPendingReimbursementRequestsServlet
 */
public class GetPendingReimbursementRequestsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetPendingReimbursementRequestsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		HttpSession session = req.getSession();
//		session.getAttribute("user");
//		ReimbursementReqDAOImplOJDBC pendingReimbursementReq = new ReimbursementReqDAOImplOJDBC();
//		List<ReimbursementReq> pendingReimbursementReqList = new ArrayList<>();
//		pendingReimbursementReqList= pendingReimbursementReq.getPendingRequests();
////		ReimbursementReq test = new ReimbursementReq("desmond", "darko", "st", 5);
//		ObjectMapper om = new ObjectMapper();
//		String json = ==null ? "null" : om.writeValueAsString(test);
////		om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//		String json = pendingReimbursementReqList==null ? "null" : om.writeValueAsString(pendingReimbursementReqList);
//		System.out.println(json);
//		double number = 22;
//		ObjectMapper om = new ObjectMapper();
//		String json = om.writeValueAsString(number);
//		resp.setContentType("application/json");
//		resp.getWriter().write(json);
//		req.getRequestDispatcher("/viewpendingrequests.html");
	}
	
//	public static ReimbursementReq getReimbursementReqData(ReimbursementReq pendingReimbursementReq) {
//		pendingReimbursementReq.getFirst_name();
//		pendingReimbursementReq.getLast_name();
//		pendingReimbursementReq.getReimbursement_type();
//		pendingReimbursementReq.getReimbursement_amount();
//		return pendingReimbursementReq;
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
